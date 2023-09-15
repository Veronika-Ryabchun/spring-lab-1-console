package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MySpringConsoleHelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Begin of main");
        SpringApplication.run(MySpringConsoleHelloWorldApplication.class, args);
        System.out.println("End of main");
    }
}

@Component
@Order(1)
class First implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("First");
    }
}

@Component
@Order(3)
class Second implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Second");
    }
}

@Component
@Order(2)
class ConsoleRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from Spring Boot!");
    }
}

