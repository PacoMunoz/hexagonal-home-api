package com.pmg.homedataservice.infractructure.entrypoint.api;

import com.pmg.homedataservice.aplication.measurement.dto.MeasurementDTO;
import com.pmg.homedataservice.aplication.measurement.service.CreateMeasurement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homedataservice/v1")
@RequiredArgsConstructor
public class CommandMeasurementController {

    private final CreateMeasurement createMeasurement;
    @PostMapping("/measurement")
    public void create(MeasurementDTO measurement) {
        createMeasurement.create(measurement);
    }
}
