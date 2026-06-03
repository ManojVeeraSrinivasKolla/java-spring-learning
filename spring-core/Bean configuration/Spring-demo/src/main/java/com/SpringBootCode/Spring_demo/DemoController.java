package com.SpringBootCode.Spring_demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define private field for the dependency injection
    private Coach myCoach;
//    private Coach anotherCoach;

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

//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach thecoach,
//                          @Qualifier("cricketCoach") Coach othercoach){
//        System.out.println("In constructor : "+getClass().getSimpleName());
//        myCoach=thecoach;
//        anotherCoach=othercoach;
//    }

    @Autowired
    public DemoController(@Qualifier("sam") Coach thecoach){
        System.out.println("In constructor : "+getClass().getSimpleName());
        myCoach=thecoach;

    }




    @GetMapping("/dailyWorkOut")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkOut();

    }

//    @GetMapping("/check")
//    public String check(){
//        return "comparing beans: myCoach=anotherCoach, "+(myCoach==anotherCoach);
//    }

}
