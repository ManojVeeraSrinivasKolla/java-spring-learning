package com.SpringBootCode.Spring_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

//    @Bean
//    public Coach swimCoach(){
//        return new SwimCoach();
//    }
@Bean("sam")
public Coach swimCoach(){
    return new SwimCoach();
}
}
