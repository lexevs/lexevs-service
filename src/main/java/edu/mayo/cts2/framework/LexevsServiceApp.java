package edu.mayo.cts2.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:spring/root-context.xml")
public class LexevsServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(LexevsServiceApp.class, args);
    }
}