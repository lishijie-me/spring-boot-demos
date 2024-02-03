package io.adam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("io.adam.mapper")
@SpringBootApplication
public class SpringBootDemoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoWebApplication.class, args);
    }

}
