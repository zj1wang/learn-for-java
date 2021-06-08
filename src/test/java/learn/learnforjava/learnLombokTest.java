package learn.learnforjava;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

class learnLombokTest {
    @Mock
    TestMock testMock;
    //一般使用 Mockito 需要执行下面三步
    //模拟并替换测试代码中外部依赖
    //执行测试代码
    //验证测试代码是否被正确的执行


    //把Mock的注入，其他的不变，它会根据类型来注入对象里面的成员方法和变量
    @InjectMocks
    TestMock testMock1;

    @Test
    public void di_sds(){
        //
        when(testMock.getI()).thenReturn(1);
        //输入不同，返回不同
        when(testMock.equals(1)).thenReturn(null);
        when(testMock.equals(2)).thenReturn(false);
        when(testMock.equals(anyInt())).thenReturn(false);

        assertEquals(false,testMock.equals(2));
        //异常
        doThrow(new Exception()).when(testMock).setI(1);
        //Mockito 会跟踪 mock 对象里面所有的方法和变量
        //验证 mock 对象方法是否被调用
        verify(testMock,times(1)).equals(1);




    }

}