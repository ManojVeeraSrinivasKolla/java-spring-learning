package com.example.bigProject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


     //injecting properties values
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    @GetMapping("/teaminfo")
    public String team(){
        return teamName;
    }

    @GetMapping("/coachinfo")
    public String coach(){
        return coachName;
    }
    @GetMapping("/")
    public String Hello(){
         return "Hello world";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Hello world workoutting 5k";
    }
}
