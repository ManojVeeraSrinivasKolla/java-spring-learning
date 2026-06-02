package com.SpringBootCode.Setter_Injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "practice slot Tennisfor 55 minutes -!!!!!";
    }
}
