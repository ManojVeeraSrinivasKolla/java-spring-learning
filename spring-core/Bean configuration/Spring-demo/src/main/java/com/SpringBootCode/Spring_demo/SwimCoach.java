package com.SpringBootCode.Spring_demo;

public class SwimCoach implements Coach{

   public SwimCoach(){
       System.out.println("In constructor : "+getClass().getSimpleName());
   }
    @Override
    public String getDailyWorkOut() {
        return "swim daily 1003m";
    }
}
