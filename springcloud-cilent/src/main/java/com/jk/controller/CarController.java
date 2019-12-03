package com.jk.controller;

import com.jk.model.Car;
import com.jk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ClassName CarController
 * @Deacription TODO
 * @Author liushuxin
 * @Date 2019/12/2 17:24
 * @Version 1.0
 **/
@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping(value = "queryCar",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> queryCar(@RequestParam Integer page, @RequestParam Integer rows, @RequestBody  Car car){
        Map<String, Object> map = carService.queryCar(page, rows, car);
        return map;
    }

    @RequestMapping("addCar")
    @ResponseBody
    public  void  addCar(@RequestBody Car car){
        carService.addCar(car);
    }

    @RequestMapping(value ="deleteCarById",method = RequestMethod.POST)
    @ResponseBody
    public void deleteCarById(@RequestParam String id){
        carService.deleteCarById(id);
    }

    @PostMapping("queryCarById")
    @ResponseBody
    public Car queryCarById(@RequestParam Integer id){
        return carService.queryCarById(id);
    }
    @PostMapping("updateCar")
    @ResponseBody
    public void updateCar(@RequestBody Car car){
        carService.updateCar(car);
    }
}
