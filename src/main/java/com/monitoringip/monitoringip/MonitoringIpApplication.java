package com.monitoringip.monitoringip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MonitoringIpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitoringIpApplication.class, args);
    }

}
