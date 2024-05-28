package com.monitoring.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMonitoringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMonitoringDemoApplication.class, args);
    }

    @GetMapping("/message")
    public String home() {
        return "Welcome to Spring Boot Monitoring Demo!!!";
    }

}
