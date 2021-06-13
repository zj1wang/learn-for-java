package learn.learnforjava.redis学习;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class 拦截器配置类 implements WebMvcConfigurer {
    @Autowired
    拦截器 redis;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(redis)
                .addPathPatterns("xxxx/xxxx")//拦截，调取拦截器函数redis
                .excludePathPatterns("xxxx/xxxx");//放行 不调用
    }

}
