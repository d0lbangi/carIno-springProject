package com.d0lbangi.carinfo.domain;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

@MappedSuperclass
@Data
public abstract class BaseEntity {

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedAt;

}
