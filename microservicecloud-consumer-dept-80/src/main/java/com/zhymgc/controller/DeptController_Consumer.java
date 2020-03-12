package com.zhymgc.controller;

import com.zhymgc.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Administrator on 2020-3-11.
 */
@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add",produces = "application/json;charset=utf-8")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add",
                dept, Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}",produces = "application/json;charset=utf-8")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id,
                Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list", produces = "application/json;charset=utf-8")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list",
                List.class);
    }

}
