package com.morozov.lab3.repositories;

import com.morozov.lab3.models.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CarRepository extends CrudRepository<Car, Long> {
    @Query("FROM Car u where u.user.id = :userId")
    Car findCarByUserId(@Param("userId") Long userId);
}
