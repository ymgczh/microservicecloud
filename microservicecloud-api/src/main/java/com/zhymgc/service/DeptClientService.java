package com.zhymgc.service;

import com.zhymgc.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2020-3-13.
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public boolean add(Dept dept);


    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public Dept get(@PathVariable("id") Long id);


    @RequestMapping(value = "/dept/list",method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public List<Dept> list();
}
