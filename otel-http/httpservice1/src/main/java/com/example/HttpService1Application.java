package com.example;

import io.opentelemetry.sdk.trace.samplers.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HttpService1Application {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public Sampler defaultSampler() {
//        return Sampler.alwaysOn();
//    }

    public static void main(String[] args) {
        SpringApplication.run(HttpService1Application.class, args);
    }
}
