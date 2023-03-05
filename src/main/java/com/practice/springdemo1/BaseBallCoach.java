package com.practice.springdemo1;

public class BaseBallCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;
    //define a constructor for dependency injection
    public BaseBallCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkOut(){
        return "Spend 30 mintues on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
