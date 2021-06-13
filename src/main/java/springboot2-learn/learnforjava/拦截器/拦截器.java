package learn.learnforjava.拦截器;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*http请求在到达controller之前，会被很多拦截器处理
*
*
* 过程：
* 写拦截器
* 放入拦截器
*
*
* */
@Component
public class 拦截器 implements HandlerInterceptor {

    @Override
//    true放行，flase 请求就不会到了
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}
