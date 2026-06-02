package com.example.constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "practice fast bowiling for 15 minutes -!!!!!";
    }
}
