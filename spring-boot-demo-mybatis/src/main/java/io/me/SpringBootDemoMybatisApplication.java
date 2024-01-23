package io.me;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("io.me.mapper")
@SpringBootApplication
public class SpringBootDemoMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoMybatisApplication.class, args);
    }

}
