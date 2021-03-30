package com.xlxu.modular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ModularApplication {

    public static void main(String[] args) {

        SpringApplication.run(ModularApplication.class, args);
    }

}
