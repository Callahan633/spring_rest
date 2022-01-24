package com.morozov.lab3.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "insurances")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private boolean is_active;
    private BigDecimal tax_sum;
    private BigDecimal insurance_sum;

    @JsonBackReference
    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "id")
    private Car car;

}
