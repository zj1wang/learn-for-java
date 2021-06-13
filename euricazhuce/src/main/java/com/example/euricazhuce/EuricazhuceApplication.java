package com.example.euricazhuce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启服务注册到注册中心 注册后，就可以使用其他服务或者被其他服务调用了
public class EuricazhuceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuricazhuceApplication.class, args);
    }

}
