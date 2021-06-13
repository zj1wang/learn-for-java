package learn.learnforjava.消息队列redis实现;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class Listenner implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] pattern) {

    }
}
