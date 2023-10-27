package com.d0lbangi.carinfo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "car")
public class Car extends BaseEntity {

    public Car(String modelName, Company company, Integer passengerCapacity) {
        this.modelName = modelName;
        this.company = company;
        this.passengerCapacity = passengerCapacity;
        super.setUpdatedAt(new Date());
        super.setCreatedAt(new Date());
    }

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
