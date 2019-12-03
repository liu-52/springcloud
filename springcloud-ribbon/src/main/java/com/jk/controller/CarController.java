package com.jk.controller;

import com.jk.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: liushuxin
 * @Date: 2019/12/3 19:05
 * @Description:
 */
@Controller
public class CarController {
    @Autowired
    private RibbonService ribbonservice;
    @RequestMapping("test")
    public void test(){
        ribbonservice.hiService();
    }
}
