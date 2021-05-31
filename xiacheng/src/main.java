import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new TimeThread();
        t.start();
        t.sleep(1);
        //发出了“中断请求”，至于t线程是否能立刻响应，要看具体代码
        t.interrupt();
        /*
        等进程结束
        */
        t.join();
        //守护线程
        Thread t2 = new Thread();
        t2.setDaemon(true);
        t2.start();
        t2.setDaemon(true); //设置为守护线程，在JVM中，所有非守护线程都执行完毕后，无论有没有守护线程，虚拟机都会自动退出。
        /*
        线程同步---注意共享量的写入修改，枷锁
       操作共享量，必须是原子操作，加锁

*/
        Thread t3 = new Thread() {
            @Override
            public void run() {
                //对一个对象枷锁，封装在对象中更清晰
                synchronized (this) {
                    Count.count++;
                }
            }
        };
        TimeThread t4 = new TimeThread();
        t3.start();
        t4.start();

    }
}

//共享量
class Count {
    public static int count = 0;

    //使用方法时就封装的加锁
    public void add() throws InterruptedException {
        synchronized (this)//
        //java允许同一个线程，多次获得同一个锁
        {
            synchronized (this) {
                count++;
            }
            this.wait();//进入等待状态， 释放this锁，其他进程可以访问，等待唤醒
        }
    }

    public synchronized void dec() {
        count--;
        this.notify();//唤醒在等this锁的进程
    }
}

class TimeThread extends Thread {
    @Override
    public void run() {
        isInterrupted();
        super.run();
    }
}

//ReebtraabtLock,Condition
class TaskQuene {
    private final Lock lock = new ReentrantLock();
    //condition从Lock中来
    private final Condition condition = lock.newCondition();
    private Queue<String> queue = new LinkedList<>();

    public void add(String s) {
        lock.lock();
        try {

        } finally {
            lock.unlock();
        }
    }

    public void dec(String s) throws InterruptedException {
        lock.lock();
        condition.await();//主动释放，进入等待
        lock.unlock();
    }
}

/*

读写锁
包含不过头
对于写锁，读是写不允许。
写唯一
无写，读随意

适用：有大量线程读取，但仅有少数线程修改。
*/
class ReadAndWrite {
    //建立读写锁
    private final ReadWriteLock rwlock = new ReentrantReadWriteLock();

    //获取读
    private final Lock rlock = rwlock.readLock();

//    获取写

    private final Lock wlock = rwlock.writeLock();

    private int count = 0;

    public void inc() {
        //使用写锁
        wlock.lock();
        try {
        } finally {
            wlock.unlock();
        }
    }

    public void get() {
        //使用读锁
        rlock.lock();
        try{}
        finally {rlock.unlock();}

    }

}
/*

乐观读锁和悲观读锁
        乐观读锁，上锁后可以写
进一步提高并发
*/
class LeGuan{
    private final StampedLock stampedLock = new StampedLock();
    private int x;
    public void write(){
        long l = stampedLock.writeLock();
        try{

        }finally {
            stampedLock.unlockWrite(l);
        }
    }
    public void read(){
        long l = stampedLock.tryOptimisticRead();//乐观锁
        //du、

        //校验结果，不行就上悲观
        if(!stampedLock.validate(l)){
            l = stampedLock.readLock();//悲观锁
            try{
                //xxxxx

            }finally {
                stampedLock.unlockWrite(l);
            }
        }
    }
}

//java 自带的并线程安全的集合java.util.concurrent
class Concurrent{
    public void simple(){
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        CopyOnWriteArraySet<String> strings1 = new CopyOnWriteArraySet<>();
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        LinkedBlockingQueue<Object> objects = new LinkedBlockingQueue<>();
        LinkedBlockingDeque<Object> objects1 = new LinkedBlockingDeque<>();
    }
}

//Atomic 原子操作--通过无锁的方式，实现高并发


//线程池 线程池内部维护了若干个线程 重复利用线程
class Xainchengch{
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    public void dosomething() throws ExecutionException, InterruptedException {
//        创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        提交任务
        executorService.submit(()->{
            threadLocal.set("sds");//放入上下文
            threadLocal.get();//获取上下文
            threadLocal.remove();//去除上下文
        });
        executorService.submit(()->{});
        Future<?> submit = executorService.submit(() -> {
        });
//        可以获取任务结果
        Object o = submit.get();//阻塞等待结果


    }
}
//上下文定义：在一个线程中，横跨若干方法调用，需要传递的对象，我们通常称之为上下文（Context），它是一种状态，可以是用户身份、任务信息等。
class Run implements Runnable{
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    @Override
    public void run() {
        threadLocal.set("sds");//放入上下文

        //其他函数调用 do1()  do2()
        threadLocal.get();//获取上下文

//        注意清空上下文
        threadLocal.remove();//去除上下文
    }

}

//线程私有量 --上下文



