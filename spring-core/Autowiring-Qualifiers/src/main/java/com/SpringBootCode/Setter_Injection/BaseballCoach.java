package com.SpringBootCode.Setter_Injection;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "practice slot Baseball for 55 minutes -!!!!!";
    }
}
