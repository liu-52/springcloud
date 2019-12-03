package com.jk.mapper;

import com.jk.model.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CarMapper
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/12/2 17:27
 * @Version 1.0
 **/
public interface CarMapper {

    List<Car> queryCar(Car car);

    void addCar(Car car);

    void deleteCarById(@Param("value") String id);

    Car queryCarById(Integer id);

    void updateCar(Car car);
}
