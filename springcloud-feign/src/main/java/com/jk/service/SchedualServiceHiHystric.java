package com.jk.service;

import com.jk.model.Car;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Auther: liushuxin
 * @Date: 2019/12/3 20:11
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements CarService {
    @Override
    public Map<String, Object> queryCar(Integer page, Integer rows, Car car) {
        return null;
    }
}
