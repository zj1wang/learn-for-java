package learn.learnforjava.yml和环境变量选择;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.xxx")//整体映射yml文件
@Profile("test")//当yml为test的时候，这个组件才生效
public class 配置 {
    @Value("${systemProperties.myProp}")//单个读取yml,或者环境变量,系统参数，命令行参数
    //优先级，覆盖，命令行--yml--系统环境变量     外优先内，环境指定优先
    private String on1;
    @Value("${os.name}")//单个读取yml,或者环境变量
    private String on2;
    private String on3;
    private String on4;
}
