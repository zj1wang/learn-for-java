package learn.learnforjava.异常处理;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//一般自定义异常处理函数就行
@Order(value = Ordered.HIGHEST_PRECEDENCE)//自定义异常解析器排到最前面解析
@Component
public class 自定义异常解析器 implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //处理处理处理
        return new ModelAndView();
    }
}
