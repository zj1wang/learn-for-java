package 微服务学习.负载均衡;

import com.sun.jdi.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

//集成Ribbon，比Ribbon+Euraca更简单---基于服务端
//Feign+Euraca基于客户端  1,建立Euraca服务注册，2，建立FeignClient注解的服务，3.主应用开启Enable,4 直接调用这个服务
//RibbonEurac1，注册Euraca服务注册 ，2，建立restTemple，3服务调用注入的restTemple 然后
public class 基于Feign去做负载均衡 {
    @Autowired
    private RestTemplate restTemplate;
    public void tet(){
        Object o = restTemplate.postForObject();

    }

}
