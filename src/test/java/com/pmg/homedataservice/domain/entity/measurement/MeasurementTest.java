package com.pmg.homedataservice.domain.entity.measurement;

import com.pmg.homedataservice.util.measurement.MeasurementUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MeasurementTest {

    @Test
    void should_create_measurement_withMinimumParameter() {
        final var measurementId = MeasurementId.randomMeasurementId();

        final var result = new Measurement.Builder(measurementId).build();

        assertThat(result.getId()).isEqualTo(measurementId);
    }

    @Test
    void should_create_measurement_withAllParameters() {
        final var result = new Measurement.Builder(MeasurementUtils.DEFAULT_MEASUREMENTID)
                .location(MeasurementUtils.DEFAULT_LOCATION)
                .humidity(MeasurementUtils.DEFAULT_HUMIDITY)
                .date(MeasurementUtils.DEFAULT_DATE)
                .temperature(MeasurementUtils.DEFAULT_TEMPERATURE)
                .build();

        assertAll(result);
    }

    private void assertAll(Measurement measurement) {
        assertThat(measurement.getDate()).isEqualTo(MeasurementUtils.DEFAULT_DATE);
        assertThat(measurement.getHumidity()).isEqualTo(MeasurementUtils.DEFAULT_HUMIDITY);
        assertThat(measurement.getTemperature()).isEqualTo(MeasurementUtils.DEFAULT_TEMPERATURE);
        assertThat(measurement.getLocation()).isEqualTo(MeasurementUtils.DEFAULT_LOCATION);
        assertThat(measurement.getId()).isEqualTo(MeasurementUtils.DEFAULT_MEASUREMENTID);
    }

}