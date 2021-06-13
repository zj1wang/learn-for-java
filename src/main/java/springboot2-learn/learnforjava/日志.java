package learn.learnforjava;


//java主流日志库 框架
//log4j 最初的
//logback  log4j 创始人 Ceki Gulcu 设计的又一个开源日记组件，目标是替代 log4j
//Log4j2 最好用，Log4j2 是 Log4j 和 Logback 的替代。

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
日志门面
不同于日志框架，提供的一个 API 封装，可以在部署的时候不修改任何配置即可接入一种日志实现方案。

slf4j：Simple Logging Facade for Java，即 java 简单日志门面。直接用AIP

使用 slf4j + Logback 可谓是目前最理想的日志解决方案了
*/
@Slf4j
//自动生成关键子
public class 日志 {
public void test(){
    log.info("dsadsa");
    log.warn("dsad");
    log.error("dsadas");
}

}
