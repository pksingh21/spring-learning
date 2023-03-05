package com.practice.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        context.close();
        //retrieve bean from spring container
        //call methods on the bean
        //close the context
    }
}
