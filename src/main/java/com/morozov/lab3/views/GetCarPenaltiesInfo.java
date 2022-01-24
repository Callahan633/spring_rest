package com.morozov.lab3.views;

import com.morozov.lab3.models.Penalty;
import com.morozov.lab3.repositories.PenaltyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetCarPenaltiesInfo {
    Logger logger = LoggerFactory.getLogger(GetCarPenaltiesInfo.class);

    @Autowired
    PenaltyRepository penaltyRepository;

    @GetMapping("{carId}/penalty_info")
    private Penalty getPenaltyInfo(@PathVariable Long carId) {
        return penaltyRepository.findPenaltyByCarId(carId);
    }
}
