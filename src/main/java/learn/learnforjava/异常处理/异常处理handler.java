package learn.learnforjava.异常处理;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
//产生错误---异常解析器（多个）：可以自定义异常解析器放到最前面
// ----有个默认异常解析器通过调用---异常解析方法--处理异常

//处理整个web的异常--组件  给异常解析器加入自定义异常处理方法
@ControllerAdvice
public class 异常处理handler {
    @ExceptionHandler({Exception.class,Error.class})//异常处理函数 处理这些异常
    public String handleEexcption(){
      log.error("dasdas:{}","hehe");
        return "ahaha";
    }
    @ExceptionHandler(Error.class)
    public ModelAndView hahaha(){
        return null;
    }


}
