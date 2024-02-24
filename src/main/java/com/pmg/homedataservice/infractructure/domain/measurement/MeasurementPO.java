package com.pmg.homedataservice.infractructure.domain.measurement;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document("sensorData")
@Data
public class MeasurementPO {
    @Id
    private String id;
    private String date;
    private BigDecimal temperature;
    private BigDecimal humidity;
    private Integer location;
}
