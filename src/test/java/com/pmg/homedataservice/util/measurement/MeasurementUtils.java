package com.pmg.homedataservice.util.measurement;

import com.pmg.homedataservice.aplication.measurement.dto.MeasurementDTO;
import com.pmg.homedataservice.domain.entity.measurement.Location;
import com.pmg.homedataservice.domain.entity.measurement.Measurement;
import com.pmg.homedataservice.domain.entity.measurement.MeasurementId;
import com.pmg.homedataservice.infractructure.domain.measurement.MeasurementPO;

import java.math.BigDecimal;
import java.util.UUID;

public enum MeasurementUtils {
    GET;

    public static MeasurementId DEFAULT_MEASUREMENTID = new MeasurementId(UUID.fromString("61e43118-2fca-4682-a769-a07ff14a7b34"));
    public static String DEFAULT_DATE = "2024-01-06T23:49:19+0100";
    public static BigDecimal DEFAULT_TEMPERATURE = new BigDecimal(12.3);

    public static BigDecimal DEFAULT_HUMIDITY = new BigDecimal(78);

    public static Location DEFAULT_LOCATION = Location.valueOf("PATIO");

    public Measurement.Builder defaultMeasurement() {
        return new Measurement.Builder(DEFAULT_MEASUREMENTID)
                .date(DEFAULT_DATE)
                .temperature(DEFAULT_TEMPERATURE)
                .location(DEFAULT_LOCATION)
                .humidity(DEFAULT_HUMIDITY);
    }

    public MeasurementDTO defaultMeasurementDTO() {
        final var measurementDTO = new MeasurementDTO();
        measurementDTO.setDate(DEFAULT_DATE);
        measurementDTO.setLocation(DEFAULT_LOCATION.value());
        measurementDTO.setHumidity(DEFAULT_HUMIDITY);
        measurementDTO.setTemperature(DEFAULT_TEMPERATURE);

        return measurementDTO;
    }

    public MeasurementPO defaultMeasurementPO() {
        final var measurementPO = new MeasurementPO();
        measurementPO.setId(DEFAULT_MEASUREMENTID.value().toString());
        measurementPO.setLocation(DEFAULT_LOCATION.value());
        measurementPO.setDate(DEFAULT_DATE);
        measurementPO.setHumidity(DEFAULT_HUMIDITY);
        measurementPO.setTemperature(DEFAULT_TEMPERATURE);

        return measurementPO;
    }
}
