package com.SpringBootCode.Setter_Injection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for the dependency injection
    private Coach myCoach;

//
//    //dependency injection
//    @Autowired
//    private Coach myCoach;
//    //defining the constructor for dependency injection

//    @Autowired
//    public DemoController (@Qualifier("tennisCoach") Coach thecoach){
//         myCoach=thecoach;
//    }

//    @Autowired
//    public void  setCoach (@Qualifier("cricketCoach") Coach thecoach){
//        myCoach=thecoach;
//    }

    @Autowired
    public void  setCoach (Coach thecoach){
        myCoach=thecoach;
    }




    @GetMapping("/dailyWorkOut")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkOut();
    }

}
