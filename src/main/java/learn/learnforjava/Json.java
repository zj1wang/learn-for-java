package learn.learnforjava;
//jason的学习：
//jason的优点：
//        平台无关性 性能一般
//两种结构：{} []键值对和数组
//主流库
//        Fastjson - 阿里巴巴开发的 JSON 库，性能十分优秀。
//        Jackson - 社区十分活跃且更新速度很快。Spring 框架默认 JSON 库。
//        Gson - 谷歌开发的 JSON 库，目前功能最全的 JSON 库 。

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Json {
}
@JsonInclude(JsonInclude.Include.NON_NULL)//非空的属性会序列化
@JsonIgnoreProperties(ignoreUnknown = true)//反序列化时，无法识别的属性，直接忽
class Mybean{
    @JsonProperty("name")
    //定义jason序列化和反序列化后的名字
    private String _name;
    @JsonIgnore//=忽略这个字段初始化
    private String haha;
    @JsonSerialize(using = ToStringSerializer.class)//自定义函数序列化
    private Long haha1;
    private String haha2;
    //
//    双向链接的类
    @JsonManagedReference
    private List<Mybean2> mybean2List;
    //自定义序列化，反序列化
    @JsonSerialize(using = xxxx.class)
    @JsonDeserialize(using = xxx.class)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")//日期的序列化和反序列化
    private Data data;

    private class xxx extends JsonDeserializer<Data> {
        @Override
        public Data deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            String text = p.getText();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:sss");
            try {
                Date parse = simpleDateFormat.parse(text);
                return parse
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    private class xxxx extends JsonSerializer<Date> {
        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

        }
    }
}
@Data
class Mybean2{
    private int i;
     //双向链接的类 序列化——》mybean——》ListMybean2-》mybean无限递归
    //两种方式，@JsonIgnore，直接忽略，or@JsonManagedReference和@JsonBackReference一个用于父级角色，另一个用于子级角色：
//    概括地说，如果在序列化或反序列化过程中不需要这些属性，则可以使用@JsonIgnore。否则，使用@JsonManagedReference / @JsonBackReference对是可行的方法。
    @JsonBackReference
    private Mybean mybean;
}
