package org.bookiosk.ai;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Paths;

/**
 * Spring Boot Starter
 *
 * @author Frank Zhang
 */
@SpringBootApplication(scanBasePackages = {"org.bookiosk.ai", "com.alibaba.cola"})
@MapperScan("org.bookiosk.ai")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
