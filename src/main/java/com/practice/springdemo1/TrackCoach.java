package com.practice.springdemo1;

public class TrackCoach implements Coach {
    //define a private field for the dependency
    private FortuneService fortuneService;
    //define a constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkOut(){
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
