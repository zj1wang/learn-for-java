import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class 事务管理 {
    /*
    * 1.记录失败的位置，问题修复之后，从上一次执行失败的位置开始继续执行后面要做的业务逻辑
2.在执行失败的时候，回退本次执行的所有过程，让操作恢复到原始状态，带问题修复之后，重新执行原来的业务逻辑-------------事务管理
    * */
    @Transactional(propagation = Propagation.REQUIRED//传播 开始当前事务之前，一个事务上下文已经存在，此时有若干选项可以指定一个事务性方法的执行行为,
            //隔离级别)
            ,isolation = Isolation.DEFAULT)
    public  void test(){
        //这是一个事务，失败了会回滚
        //
        //
    }

}
