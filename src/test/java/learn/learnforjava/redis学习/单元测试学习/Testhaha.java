package learn.learnforjava.redis学习.单元测试学习;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest//可以使用自动注入了,加载spring容器
@ExtendWith(MockitoExtension.class)
public class Testhaha {
    @BeforeAll
    @BeforeEach
    @AfterEach
    @AfterAll
    public void 执行() {

    }

    //各种注解
    @Test
    @DisplayName("dasdsad")
    @Timeout(value = 400, unit = TimeUnit.DAYS)
    @Disabled
    @RepeatedTest(5)
    public void haha() {

        /*
        。。。。
        。。。。
        。。。。*/
        // ## 断言
        assertEquals(1, 1);
        assertArrayEquals(new int[]{1, 2}, new int[]{1, 2});
        assertThrows(Exception.class,()->{});


    }

    @Nested
    class 嵌套测试{
        @Test
        public void hahahahha(){

        }
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,42,2})
    @EmptySource
    @NullSource
    @CsvSource({"sadas,dsad","sadas,dasd"})
    public void 参数化测试(int i){

    }

}
