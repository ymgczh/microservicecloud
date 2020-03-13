package com.zhymgc.controller;

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
    @ResponseBody
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping(value = "dept/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @RequestMapping(value = "dept/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Dept> list(){
        return deptService.getAll();
    }

//    @RequestMapping(value = "dept/discovery", method = RequestMethod.GET)
//    public Object discovery(){
//
//        client.getInstanceRemoteStatus();
//
//        return deptService.getAll();
//    }

}
