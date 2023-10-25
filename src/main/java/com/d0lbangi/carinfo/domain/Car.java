package com.d0lbangi.carinfo.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "car")
public class Car extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model_name")
    private String modelName;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(name = "passenger_capacity")
    private Integer passengerCapacity;
}
