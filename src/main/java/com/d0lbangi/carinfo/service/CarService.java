package com.d0lbangi.carinfo.service;

import com.d0lbangi.carinfo.domain.Car;
import com.d0lbangi.carinfo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serial;
import java.util.Date;
import java.util.List;

@Serial
@Transactional
public class CarService {
    @Autowired
    CarRepository carRepository;
    @Autowired
    CompanyService companyService;

    public Car saveCarInputDto(CarInputDTO carInputDTO) {
        Car car = new Car();
        car.setModelName(carInputDTO.getModelName());
        car.setPassengerCapacity(carInputDTO.getPassengerCapacity());
        car.setCompany(companyService.find(carInputDTO.getCompanyId()));
        car.setCreatedAt(new Date());
        car.setUpdatedAt(new Date());

        return carRepository.save(car);
    }


    public void saveall(List<Car> carList) {
        carRepository.saveAll(carList);
    }

    public List<Car> getCarList() {

        return carRepository.getCarListByFetchJoin();
    }

    public Page<Car> getCarPage(Pageable pageable) {

        return carRepository
    }
}
