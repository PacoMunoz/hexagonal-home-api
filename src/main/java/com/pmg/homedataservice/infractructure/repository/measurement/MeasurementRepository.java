package com.pmg.homedataservice.infractructure.repository.measurement;

import com.pmg.homedataservice.infractructure.domain.measurement.MeasurementPO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface MeasurementRepository extends MongoRepository<MeasurementPO, UUID> {
    Optional<MeasurementPO> findTopByOrderByDateDesc();
}
