package com.tsing.product;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @Description 核心启动类
 * @author Tsing
 * @Date 2021/7/31
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.tsing.product.api")
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

}
