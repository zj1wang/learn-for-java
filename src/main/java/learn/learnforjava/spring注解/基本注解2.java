package learn.learnforjava.spring注解;

import learn.learnforjava.redis学习.拦截器;
import learn.learnforjava.包住他;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class 基本注解2 {
    @Configuration//配置类本身也是bean
    @Import(拦截器.class)//导入这个类，调用无参构造，创建bean到容器中
    @ConditionalOnBean(包住他.class)//条件装配：当容器中有这个类的bean，这个组件才会加载到容器中，下面的所有生效
//    @EnableConfigurationProperties(基本注解3.class)
    public static class 基本注解 {
        @ConditionalOnBean(包住他.class)//单个生效
        @Bean("tom")//函数返回是bean
        public String hahah(){
            return "dsads";
        }
    }
}
