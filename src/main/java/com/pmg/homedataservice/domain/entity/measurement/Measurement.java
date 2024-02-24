package com.pmg.homedataservice.domain.entity.measurement;

import com.pmg.homedataservice.domain.exception.DomainException;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Measurement {
    private final MeasurementId id;
    private final String date;
    private final BigDecimal temperature;
    private final BigDecimal humidity;
    private final Location location;

    private Measurement(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.temperature = builder.temperature;
        this.humidity = builder.humidity;
        this.location = builder.location;
    }

    public MeasurementId getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public Location getLocation() {
        return location;
    }

    public static class Builder {
        private final MeasurementId id;
        private String date;
        private BigDecimal temperature;
        private BigDecimal humidity;
        private Location location;

        public Builder(MeasurementId id) {
            this.id = id;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder temperature(BigDecimal temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder humidity(BigDecimal humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        public Measurement build() {
            checkDate();
            ckeckLocation();
            return new Measurement(this);
        }

        private void ckeckLocation() {

        }

        private void checkDate() {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
            try {
                format.parse(date);
            } catch (ParseException e) {
                throw new DomainException("La fecha no cumple el formato requerido");
            }
        }


    }

    @Override
    public String toString() {
        return "id=" + id.value() +
                ", date='" + date +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", location='" + location;
    }
}
