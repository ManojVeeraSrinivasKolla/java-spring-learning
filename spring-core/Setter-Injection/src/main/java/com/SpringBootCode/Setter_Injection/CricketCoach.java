package com.SpringBootCode.Setter_Injection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "practice slot bowiling for 55 minutes -!!!!!";
    }
}
