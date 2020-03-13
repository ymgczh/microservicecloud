package com.zhymgc.service;

import com.zhymgc.entities.Dept;

import java.util.List;

/**
 * Created by Administrator on 2020-3-11.
 */
public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> getAll();
}
