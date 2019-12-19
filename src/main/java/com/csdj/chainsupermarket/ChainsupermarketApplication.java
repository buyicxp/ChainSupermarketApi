package com.csdj.chainsupermarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.csdj.chainsupermarket.dao/*")
@EnableScheduling
@EnableTransactionManagement
public class ChainsupermarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainsupermarketApplication.class, args);
    }

}
