package com.pmg.homedataservice.domain.entity.measurement;

import com.pmg.homedataservice.domain.exception.DomainException;

public enum Location {
    PATIO(1),
    ESTUDIO(2);

    private Integer value;

    private Location(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static Location valueOf(Integer value) {
        for (Location location : Location.values()) {
            if (location.value.equals(value)) {
                return location;
            }
        }
        throw new DomainException("No se reconoce la localizacion enviada");
    }
}
