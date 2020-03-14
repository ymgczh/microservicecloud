package com.zhymgc.service;

import com.zhymgc.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2020-3-14.
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).
                        setDname("没有信息").
                        setDb_source("no info in db");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
