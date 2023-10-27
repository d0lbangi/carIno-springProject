package com.d0lbangi.carinfo.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "company")
@Data
public class Company extends BaseEntity{

    public Company(){}
    public Company(String companyName, String companyNation){
        this.companyName = companyName;
        this.companyNation = companyNation;
        super.setUpdatedAt(new Date());
        super.setCreatedAt(new Date());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_nation")
    private String companyNation;
}
