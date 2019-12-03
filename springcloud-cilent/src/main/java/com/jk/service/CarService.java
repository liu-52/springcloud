package com.jk.service;

import com.jk.model.Car;

import java.util.Map;

/**
 * @ClassName CarService
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/12/2 17:24
 * @Version 1.0
 **/
public interface CarService {
    Map<String, Object> queryCar(Integer page, Integer rows, Car car);

    void addCar(Car car);

    void deleteCarById(String id);

    Car queryCarById(Integer id);

    void updateCar(Car car);
}
