package learn.learnforjava;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class LearnForJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnForJavaApplication.class, args);
	}

}
