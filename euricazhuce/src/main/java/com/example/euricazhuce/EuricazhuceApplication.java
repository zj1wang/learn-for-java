package com.example.euricazhuce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启服务注册到注册中心
public class EuricazhuceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuricazhuceApplication.class, args);
    }

}
