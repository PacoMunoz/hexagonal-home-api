package com.pmg.homedataservice.aplication.measurement.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MeasurementDTO {
    private String date;
    private BigDecimal temperature;
    private BigDecimal humidity;
    private Integer location;
}
