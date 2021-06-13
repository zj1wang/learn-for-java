package learn.learnforjava.原生组件;

public class 理解 {
//    原生组件就是： servlet filter linster
    /*
    原生TOMCAT过程，htttp请求，到servlet---对应的filter处理----执行servlet逻辑（期间被监听）
    spring过程，http请求，到dispatchservlet(spring的servlet，path是 /包含所有)-----过滤器----controller调用业务逻辑
    * */
    //本章目的：
    //在spring中注册自己的servlet filter linster
    //方法：标记注解 @servlet   filter linster  主应用开启@ServletComponentScan



//    默认server是tomcat，可以通过yml换，包括servlet的数量、端口号等
}
