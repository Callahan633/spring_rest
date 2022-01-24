package com.morozov.lab3.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private String manufacturer;

    private String model;

    @JsonManagedReference
    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "id")
    private Penalty penalty;

    @JsonManagedReference
    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "id")
    private Insurance insurance;

    @JsonBackReference
    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "id")
    private User user;
}
