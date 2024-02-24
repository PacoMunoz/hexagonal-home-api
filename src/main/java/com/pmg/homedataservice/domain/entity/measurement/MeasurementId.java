package com.pmg.homedataservice.domain.entity.measurement;

import java.util.Objects;
import java.util.UUID;

public record MeasurementId(UUID value) {
    public MeasurementId {
        Objects.requireNonNull(value, "MeasurementId is required");
    }

    public static MeasurementId randomMeasurementId() {
        return new MeasurementId(UUID.randomUUID());
    }
}
