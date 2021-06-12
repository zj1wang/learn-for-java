package learn.learnforjava.异常处理;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class 自定义异常 extends RuntimeException{
}
