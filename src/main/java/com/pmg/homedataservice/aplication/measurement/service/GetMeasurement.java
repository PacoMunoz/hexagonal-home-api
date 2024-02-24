package com.pmg.homedataservice.aplication.measurement.service;

import com.pmg.homedataservice.aplication.measurement.dto.MeasurementDTO;
import com.pmg.homedataservice.domain.entity.measurement.Location;
import com.pmg.homedataservice.domain.entity.measurement.Measurement;
import com.pmg.homedataservice.domain.entity.measurement.MeasurementId;

enum GetMeasurement {
    FROM;

    public Measurement measurementDTO(MeasurementDTO measurementDTO) {
        return new Measurement.Builder(MeasurementId.randomMeasurementId())
                .date(measurementDTO.getDate())
                .temperature(measurementDTO.getTemperature())
                .humidity(measurementDTO.getHumidity())
                .location(Location.valueOf(measurementDTO.getLocation()))
                .build();
    }
}
