package com.xiaqingbo.dispatchcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan(value={"com.xiaqingbo.dispatchcenter"})
public class DispatchCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DispatchCenterApplication.class, args);
    }

}
