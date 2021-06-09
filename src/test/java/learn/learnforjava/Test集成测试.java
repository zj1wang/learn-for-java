package learn.learnforjava;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

//加载bean,启动spring服务，此批注有助于编写集成测试。它启动嵌入式服务器并完全初始化应用程序上下文。可以使用@Autowired批注将依赖项注入测试类中。
@SpringBootTest
//拓展测试，加载mock等
@ExtendWith(SpringExtension.class)
//加载profile为test的bean，和没有设置profile的bean，设置了且不一致的不加载
@ActiveProfiles(profiles = "test")
abstract public  class Test集成测试 {
    protected MockMvc mockMvc;
    @Autowired
    private ApplicationContext wc;
    @BeforeEach
    //注册mock
    public void baseBefore() {
        this.mockMvc= MockMvcBuilders.webAppContextSetup(wc);
//        每个测试前注册一个全新的mockMVC
    }


}
