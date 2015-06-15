package com.hotel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import com.mangofactory.swagger.plugin.EnableSwagger;

@EnableHystrix
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
@EnableSwagger
//@EnableAdminServer
public class HotelDetailsServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(HotelDetailsServiceApplication.class, args);
    }

}
