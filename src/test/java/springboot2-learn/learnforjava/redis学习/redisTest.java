package learn.learnforjava.redis学习;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class redisTest {
    @Autowired
    StringRedisTemplate redisTemplate;
    @Test
    public void testForRedis(){
        ValueOperations<String, String> stringStringValueOperations = redisTemplate.opsForValue();//操作对象
        stringStringValueOperations.set("haha","ahha");//送入数据
        String haha = stringStringValueOperations.get("haha");//获取数据
    }


}