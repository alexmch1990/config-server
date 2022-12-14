package com.moraleda.springconfigserverexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigServerExampleApplication.class, args);
    }

}
