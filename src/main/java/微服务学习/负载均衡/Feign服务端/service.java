package 微服务学习.负载均衡.Feign服务端;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "微服务的名字Eruca上的，或者直接写对应微服务的url")
@Component
public class service {
    @GetMapping("对应的url")
    public String Fuwu(){
        return "aha";
    }
}
