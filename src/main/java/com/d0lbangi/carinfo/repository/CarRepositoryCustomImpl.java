package com.d0lbangi.carinfo.repository;

import com.d0lbangi.carinfo.domain.Car;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class CarRepositoryCustomImpl implements CarrepositoryCustom {

    @PersistenceContext
    EntityManager em;
    List<Car> getCarListByFetchJoin(){
        String query = " SELECT car FROM Car car join fetch car.company";
        List<Car> carList = em.createQuery(query, Car.class).getResultList();

        return carList;
    }
}





























