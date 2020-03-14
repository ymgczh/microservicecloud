package com.zhymgc.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhymgc.entities.Dept;
import com.zhymgc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2020-3-11.
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

//    private DiscoveryClient client;

    @RequestMapping(value = "dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping(value = "dept/get/{id}", method = RequestMethod.GET)
//    @HystrixCommand(fallbackMethod = "processHystrix_get")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.get(id);
        if (null == dept) {
            throw new RuntimeException("没有找到ID: " + id + "对应的信息");
        }
        return dept;
    }

    @RequestMapping(value = "dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.getAll();
    }


    public Dept processHystrix_get(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("没有信息").setDb_source("no info in db");
    }

}
