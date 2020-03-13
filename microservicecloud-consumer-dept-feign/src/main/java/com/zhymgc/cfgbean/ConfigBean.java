package com.zhymgc.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 直接用注解配置
 * 等同于applicationContext.xml
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    /**
//     * ribbon有各种负载均衡策略
//     * 默认策略是轮询
//     */
//    @Bean
//    public IRule myRule(){
//        //RetryRule也是轮询，但是当某一个服务down掉了，会自动跳过
//        return new RetryRule();
//    }
}
