package learn.learnforjava.文件上传学习;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class controller {
    @GetMapping("/input")
    public void dataInput(@RequestParam("email") String email,
                          @RequestParam String name,
//                          单文件：文件form-data会自动封装为MultipartFile
                          @RequestPart("name") MultipartFile fileInput,
//                          多文件
                          @RequestPart("nameduoge") MultipartFile[] fileInputduoge
    ) throws IOException {
        fileInput.getBytes();
        fileInput.getSize();
        fileInput.getOriginalFilename();
        fileInput.transferTo(new File(""));

    }
}
// 文件上床的配置：MultipartAutoConfiguration 改yml就行