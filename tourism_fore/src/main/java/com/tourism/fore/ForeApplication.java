package com.tourism.fore;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

@SpringBootApplication
@MapperScan("com.tourism.fore.mapper") //将项目中对应的mapper类的路径加进来
public class ForeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForeApplication.class, args);
    }
    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1, 1);
    }
}
