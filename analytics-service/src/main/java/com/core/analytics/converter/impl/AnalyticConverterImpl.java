package com.core.analytics.converter.impl;

import com.core.analytics.converter.IAnalyticConverter;
import com.core.analytics.domain.Analytic;
import com.core.analytics.domain.dto.AnalyticDto;

public class AnalyticConverterImpl implements IAnalyticConverter {

    @Override
    public AnalyticDto toDto(Analytic entity) {
        return null;
    }

    @Override
    public Analytic toEntity(AnalyticDto dto) {
        Analytic analytic = new Analytic();
        analytic.setEndTime(dto.getEndTime());
        analytic.setStartTime(dto.getStartTime());
        analytic.setIp(dto.getIp());
        analytic.setRequest(dto.getRequest());
        analytic.setResponse(dto.getResponse());
        analytic.setSessionkey(dto.getSessionkey());
        analytic.setService(dto.getService());
        analytic.setUserId(dto.getUserId());
        return analytic;
    }
}
