package com.jk.service;

import com.jk.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @Auther: liushuxin
 * @Date: 2019/12/3 18:36
 * @Description:
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService() {
        String url = "http://service-provider/queryCar";
        LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("page",1);
        map.add("rows",2);

        //restTemplate.postForLocation(url,map);
        String s = restTemplate.postForObject(url, map, String.class);
        //System.out.println(s);
        return null;
    }
}
