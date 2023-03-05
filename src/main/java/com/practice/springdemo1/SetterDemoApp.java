package com.practice.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    //load the spring configuration file
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getDailyFortune());
        context.close();
//retrieve bean from spring container
//call methods on the bean
//close the context
    }
}