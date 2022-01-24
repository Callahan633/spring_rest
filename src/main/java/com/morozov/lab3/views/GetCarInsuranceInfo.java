package com.morozov.lab3.views;

import com.morozov.lab3.models.Insurance;
import com.morozov.lab3.repositories.InsuranceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetCarInsuranceInfo {
    Logger logger = LoggerFactory.getLogger(GetCarInsuranceInfo.class);

    @Autowired
    InsuranceRepository insuranceRepository;

    @GetMapping("{carId}/insurance_info")
    private Insurance getInsuranceInfo(@PathVariable Long carId) {
        return insuranceRepository.findInsuranceById(carId);
    }
}
