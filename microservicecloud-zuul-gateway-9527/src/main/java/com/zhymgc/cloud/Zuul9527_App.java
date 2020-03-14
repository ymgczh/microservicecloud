package com.zhymgc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2020-3-14.
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527_App {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527_App.class, args);
    }
}
