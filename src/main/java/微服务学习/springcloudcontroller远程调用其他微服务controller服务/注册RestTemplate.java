package 微服务学习.springcloudcontroller远程调用其他微服务controller服务;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class 注册RestTemplate {
    @Bean
    @LoadBalanced//启动rabbin的负载均衡：随机访问对应的服务器
    public RestTemplate geRestTemplate(){
        return new RestTemplate();
    }
}
