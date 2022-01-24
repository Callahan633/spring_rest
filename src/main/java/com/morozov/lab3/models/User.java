package com.morozov.lab3.models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private String login;

    @JsonManagedReference
    @OneToOne(mappedBy = "user", orphanRemoval = true)
    private Car car;
}