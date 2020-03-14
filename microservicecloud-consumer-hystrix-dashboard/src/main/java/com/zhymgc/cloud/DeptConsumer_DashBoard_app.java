package com.zhymgc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by Administrator on 2020-3-14.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_app {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_app.class, args);
    }
}
