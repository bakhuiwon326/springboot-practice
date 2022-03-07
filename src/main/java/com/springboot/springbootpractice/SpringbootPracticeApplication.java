package com.springboot.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
public class SpringbootPracticeApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootPracticeApplication.class);
        SpringApplication.run(SpringbootPracticeApplication.class, args);
    }

}
