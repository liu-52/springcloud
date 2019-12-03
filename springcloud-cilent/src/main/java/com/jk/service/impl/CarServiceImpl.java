package com.jk.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.CarMapper;
import com.jk.model.Car;
import com.jk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CarService
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/12/2 17:26
 * @Version 1.0
 **/
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper carMapper;

    @Override
    public Map<String, Object> queryCar(Integer page, Integer rows, Car car) {
        Page<Object> objects = PageHelper.startPage(page, rows);
        List<Car> carList = carMapper.queryCar(car);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total",objects.getTotal());
        map.put("rows",carList);
        return map;
    }

    @Override
    public void addCar(Car car) {
        carMapper.addCar(car);
    }

    @Override
    public void deleteCarById(String id) {
        carMapper.deleteCarById(id);
    }

    @Override
    public Car queryCarById(Integer id) {
        return carMapper.queryCarById(id);
    }

    @Override
    public void updateCar(Car car) {
        carMapper.updateCar(car);
    }
}
