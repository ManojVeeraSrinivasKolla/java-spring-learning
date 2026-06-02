package com.example.constructor_injection.rest;


import com.example.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for the dependency injection
    private Coach myCoach;

    //defining the constructor for dependency injection

    @Autowired
    public DemoController(Coach theCoach ){
        myCoach=theCoach;
    }


    @GetMapping("/dailyWorkOut")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkOut();
    }

}
