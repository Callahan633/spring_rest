package com.morozov.lab3.repositories;

import com.morozov.lab3.models.Insurance;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface InsuranceRepository extends CrudRepository<Insurance, Long> {
    @Query("FROM Insurance i where i.car.id = :carId")
    Insurance findInsuranceById(@Param("carId") Long carId);
}
