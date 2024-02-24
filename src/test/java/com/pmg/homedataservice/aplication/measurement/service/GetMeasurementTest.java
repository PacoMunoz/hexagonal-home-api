package com.pmg.homedataservice.aplication.measurement.service;

import com.pmg.homedataservice.util.measurement.MeasurementUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GetMeasurementTest {

    @Test
    void should_getMeasurement_when_measurementDTO() {
        final var measurementDTO = MeasurementUtils.GET.defaultMeasurementDTO();

        final var result = GetMeasurement.FROM.measurementDTO(measurementDTO);

        assertThat(result.getId()).isNotNull();
        assertThat(result.getTemperature()).isEqualTo(measurementDTO.getTemperature());
        assertThat(result.getLocation().value()).isEqualTo(measurementDTO.getLocation());
        assertThat(result.getDate()).isEqualTo(measurementDTO.getDate());
        assertThat(result.getHumidity()).isEqualTo(measurementDTO.getHumidity());
    }

}