package 微服务学习.springcloudcontroller远程调用其他微服务controller服务;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

//springcloud知识
@Controller
@RequiredArgsConstructor
public class springcloudcontroller远程调用其他微服务controller服务 {

    private final RestTemplate restTemplate;//提供http访问远程controller的方法

    @RequestMapping("/sadsa/dd/gei/{id}")
    public String get(@PathVariable("id") String id){
        //restTemplate实现远程调用其他服务，（url，返回的参数类型）
        return restTemplate.getForObject("/ssds/dsd/外部服务的链接"+id,String.class);
    }

}
