package com.jk.controller;

import com.jk.model.Car;
import com.jk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: liushuxin
 * @Date: 2019/12/3 19:51
 * @Description:
 */
@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("queryCar")
    public Map<String,Object> queryCar(Integer page, Integer rows , Car car){
        return carService.queryCar(page,rows,car);
    }
}
