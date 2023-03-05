package com.practice.springdemo1;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;
    //create a no argument constructor
    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }
   //our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }
    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
