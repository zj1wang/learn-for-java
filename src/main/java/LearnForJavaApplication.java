import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@ServletComponentScan
@EnableFeignClients//开启Feign功能
public class LearnForJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnForJavaApplication.class, args);
	}

}
