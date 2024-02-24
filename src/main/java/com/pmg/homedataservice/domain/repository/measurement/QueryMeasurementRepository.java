package com.pmg.homedataservice.domain.repository.measurement;

import com.pmg.homedataservice.domain.entity.measurement.Measurement;

import java.util.Optional;

public interface QueryMeasurementRepository {
    Optional<Measurement> getCurrent();
}
