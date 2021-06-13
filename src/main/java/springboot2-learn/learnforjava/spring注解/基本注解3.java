package learn.learnforjava.spring注解;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "byd") //配置绑定yml类接受yml
public class 基本注解3 {
    private String car;
}
