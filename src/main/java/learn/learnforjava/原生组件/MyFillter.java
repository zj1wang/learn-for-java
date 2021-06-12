package learn.learnforjava.原生组件;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(urlPatterns = {"/css/*"})//加上这个注解，配合主app开启ServletComponentScan组件
public class MyFillter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("sadas","dsadsa");//操作req添加内容
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
