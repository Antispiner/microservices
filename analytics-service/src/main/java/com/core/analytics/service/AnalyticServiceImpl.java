package com.core.analytics.service;

import com.core.analytics.converter.impl.AnalyticConverterImpl;
import com.core.analytics.domain.Analytic;
import com.core.analytics.domain.dto.AnalyticDto;
import com.core.analytics.repository.AnalyticRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class AnalyticServiceImpl implements IAnalyticService {
    @Autowired
    AnalyticRepository repository;

    @Override
    public void processMessage(String message) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            AnalyticDto analyticDto = mapper.readValue(message, AnalyticDto.class);
            Analytic analytic = Stream.of(analyticDto).map(new AnalyticConverterImpl()::toEntity).collect(toSingleton());
            repository.save(analytic);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> Collector<T, ?, T> toSingleton() {
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    if (list.size() != 1) {
                        throw new IllegalStateException();
                    }
                    return list.get(0);
                }
        );
    }
}
