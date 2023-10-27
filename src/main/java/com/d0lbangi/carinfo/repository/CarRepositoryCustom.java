package com.d0lbangi.carinfo.repository;

import com.d0lbangi.carinfo.domain.Car;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepositoryCustom extends CarRepositoryCustomImpl<Car, Long> {

}
