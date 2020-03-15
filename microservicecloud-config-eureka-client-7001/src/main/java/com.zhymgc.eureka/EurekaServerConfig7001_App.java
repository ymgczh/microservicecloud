package com.zhymgc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2020-3-12.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerConfig7001_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfig7001_App.class,
                args);
    }
}
