package com.zhymgc;

import com.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2020-3-11.
 * MySelfRule 不能定义在componentScan下面，否则会被所有Ribbon共享
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zhymgc"})
@ComponentScan("com.zhymgc")
public class DeptConsumerFeign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_App.class, args);
    }
}
