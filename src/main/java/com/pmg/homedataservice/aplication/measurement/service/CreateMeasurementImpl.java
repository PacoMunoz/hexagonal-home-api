package com.pmg.homedataservice.aplication.measurement.service;

import com.pmg.homedataservice.aplication.measurement.dto.MeasurementDTO;
import com.pmg.homedataservice.domain.repository.measurement.CreateMeasurementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class CreateMeasurementImpl implements CreateMeasurement {

    private final CreateMeasurementRepository createMeasurementRepository;

    @Override
    public void create(MeasurementDTO measurement) {
        createMeasurementRepository.create(GetMeasurement.FROM.measurementDTO(measurement));
    }
}
