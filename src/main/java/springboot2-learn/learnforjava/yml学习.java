package learn.learnforjava;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "yml11")
public class yml学习 {
    private String name;
    private Integer integer;

}
