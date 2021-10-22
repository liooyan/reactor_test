package com.lioyan.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link Main}
 *
 * @author com.lioyan
 * @date 2021/10/19  9:44
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Main.class);
    }
}
