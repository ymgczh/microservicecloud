package com.zhymgc.controller;

import com.zhymgc.entities.Dept;
import com.zhymgc.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Administrator on 2020-3-11.
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add",produces = "application/json;charset=utf-8")
    public boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}",produces = "application/json;charset=utf-8")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list", produces = "application/json;charset=utf-8")
    public List<Dept> list(){
        return deptClientService.list();
    }



}
