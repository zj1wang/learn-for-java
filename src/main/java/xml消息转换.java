import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

public class xml消息转换 {
}
class MessasgeConverterConifg1 implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        WebMvcConfigurer.super.configureMessageConverters(converters);
    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
//jason就不用这些了，直接就可以转换
@JacksonXmlRootElement
class User{
    @JacksonXmlProperty(localName = "name")
    private String name;
    @JacksonXmlProperty(localName = "name")
    private Integer age;
}
