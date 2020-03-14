package com.zhymgc.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2020-3-14.
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344_App {

    public static void main(String[] args) {
        SpringApplication.run(Config3344_App.class,args);
    }
}
