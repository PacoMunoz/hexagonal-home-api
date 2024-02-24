package com.pmg.homedataservice.infractructure.repository.measurement;

import com.pmg.homedataservice.util.measurement.MeasurementUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MeasurementMapperTest {

    @Test
    void should_getMeasurement_when_measurementPO() {
        final var measurementPO = MeasurementUtils.GET.defaultMeasurementPO();

        final var result = MeasurementMapper.TO.measurement(measurementPO);

        assertThat(result).usingRecursiveComparison().ignoringFields("id").isEqualTo(measurementPO);
    }

}