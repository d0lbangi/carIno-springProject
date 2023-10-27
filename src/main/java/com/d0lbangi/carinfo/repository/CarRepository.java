package com.d0lbangi.carinfo.repository;

import com.d0lbangi.carinfo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {


}
