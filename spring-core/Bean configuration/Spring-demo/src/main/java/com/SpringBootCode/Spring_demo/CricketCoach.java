package com.SpringBootCode.Spring_demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "practice slot bowiling for 55 minutes -!!!!!";
    }
}
