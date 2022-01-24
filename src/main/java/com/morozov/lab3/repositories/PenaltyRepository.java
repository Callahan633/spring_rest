package com.morozov.lab3.repositories;

import com.morozov.lab3.models.Penalty;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PenaltyRepository extends CrudRepository<Penalty, Long> {
    @Query("FROM Penalty p where p.car.id = :carId")
    Penalty findPenaltyByCarId(@Param("carId") Long carId);
}
