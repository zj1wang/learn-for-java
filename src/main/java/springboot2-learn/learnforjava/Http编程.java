package learn.learnforjava;

import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.nio.ByteBuffer;
import java.util.concurrent.Flow;

/*

http
是目前最广泛的超文本传输协议，位于TCPIP之上

HTTP Header和HTTP Body两部分构成

POST /login HTTP/1.1
Host: www.example.com
Content-Type: application/x-www-form-urlencoded  body体格式
Content-Length: 30

username=hello&password=123456  body体

HTTP/1.1 200 OK
Content-Type: application/x-www-form-urlencoded  body体格式
Content-Length: 30

username=hello&password=123456  body体


响应代码：
2xx：成功
4xx：问题来自客户端  403未授权，404，资源不存在
5xx：问题来自服务器
* */
public class Http编程 {
    public static void main(String[] args) {
        HttpRequest build = HttpRequest.newBuilder(URI.create("dsad"))
                .header("xxx", "xxxx")
                .header("xxxxx", "sdasda")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(new HttpRequest.BodyPublisher() {
                    @Override
                    public void subscribe(Flow.Subscriber<? super ByteBuffer> subscriber) {

                    }

                    @Override
                    public long contentLength() {
                        return 0;
                    }
                }).build();
    }
}
