package com.morozov.lab3.views;

import com.morozov.lab3.models.Car;
import com.morozov.lab3.repositories.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetCarInfo {
    Logger logger = LoggerFactory.getLogger(GetCarInfo.class);

    @Autowired
    CarRepository carRepository;

    @GetMapping("/{userId}/car_info")
    private Car getCarInfo(@PathVariable Long userId) {
        return carRepository.findCarByUserId(userId);
    }

}
