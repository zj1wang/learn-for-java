package learn.learnforjava.springcloudcontroller远程调用其他微服务controller服务;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class 注册RestTemplate {
    public RestTemplate geRestTemplate(){
        return new RestTemplate();
    }
}
