package learn.learnforjava.拦截器;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class AdConfig implements WebMvcConfigurer {
    private final 拦截器 haha;

    public AdConfig(拦截器 haha) {
        this.haha = haha;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(haha)
                .addPathPatterns("/**")//拦 **代表所有选中
                .excludePathPatterns("/css/**");//不拦
    }
}
