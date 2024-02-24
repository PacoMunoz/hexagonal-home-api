package com.pmg.homedataservice.infractructure.repository.measurement;

import com.pmg.homedataservice.domain.entity.measurement.Location;
import com.pmg.homedataservice.domain.entity.measurement.Measurement;
import com.pmg.homedataservice.domain.entity.measurement.MeasurementId;
import com.pmg.homedataservice.infractructure.domain.measurement.MeasurementPO;

import java.util.UUID;

enum MeasurementMapper {
    TO;

    MeasurementPO measurementPO(Measurement measurement) {
        final var measurementPO = new MeasurementPO();
        measurementPO.setId(measurement.getId().value().toString());
        measurementPO.setHumidity(measurementPO.getHumidity());
        measurementPO.setDate(measurementPO.getDate());
        measurementPO.setTemperature(measurementPO.getTemperature());
        measurementPO.setLocation(measurementPO.getLocation());

        return measurementPO;
    }

    Measurement measurement(MeasurementPO measurement) {
        return new Measurement.Builder(new MeasurementId(UUID.fromString(measurement.getId())))
                .location(Location.valueOf(measurement.getLocation()))
                .date(measurement.getDate())
                .temperature(measurement.getTemperature())
                .humidity(measurement.getHumidity())
                .build();
    }
}
