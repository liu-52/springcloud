package com.jk.service;

import com.jk.model.Car;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Auther: liushuxin
 * @Date: 2019/12/3 19:50
 * @Description:
 */
@FeignClient(value = "service-provider",fallback =  SchedualServiceHiHystric.class)
public interface CarService {

    @RequestMapping(value = "queryCar",method = RequestMethod.POST)
    public Map<String,Object> queryCar(@RequestParam Integer page ,@RequestParam Integer rows,@RequestBody Car car);
}
