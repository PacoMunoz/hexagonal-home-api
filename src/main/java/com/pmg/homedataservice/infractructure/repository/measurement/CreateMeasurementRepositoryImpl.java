package com.pmg.homedataservice.infractructure.repository.measurement;

import com.pmg.homedataservice.domain.entity.measurement.Measurement;
import com.pmg.homedataservice.domain.repository.measurement.CreateMeasurementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
final class CreateMeasurementRepositoryImpl implements CreateMeasurementRepository {

    private final MeasurementRepository measurementRepository;

    @Override
    public void create(Measurement measurement) {
        measurementRepository.insert(MeasurementMapper.TO.measurementPO(measurement));
    }

}
