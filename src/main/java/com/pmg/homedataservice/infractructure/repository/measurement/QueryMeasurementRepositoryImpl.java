package com.pmg.homedataservice.infractructure.repository.measurement;

import com.pmg.homedataservice.domain.entity.measurement.Measurement;
import com.pmg.homedataservice.domain.repository.measurement.QueryMeasurementRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class QueryMeasurementRepositoryImpl implements QueryMeasurementRepository {

    private final MeasurementRepository measurementRepository;

    public QueryMeasurementRepositoryImpl(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    @Override
    public Optional<Measurement> getCurrent() {
        return measurementRepository.findTopByOrderByDateDesc().map(MeasurementMapper.TO::measurement);
    }
}
