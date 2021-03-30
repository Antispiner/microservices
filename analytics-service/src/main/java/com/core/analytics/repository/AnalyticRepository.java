package com.core.analytics.repository;

import com.core.analytics.domain.Analytic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticRepository extends CrudRepository<Analytic, Long> {
}
