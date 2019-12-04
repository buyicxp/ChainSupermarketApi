package com.csdj.chainsupermarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.csdj.chainsupermarket.dao/*")
public class ChainsupermarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainsupermarketApplication.class, args);
    }

}
