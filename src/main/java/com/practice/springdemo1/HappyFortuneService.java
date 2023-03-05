package com.practice.springdemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
    //create a list of strings and assign some data to it
    private List<String> randomFortunes = new ArrayList<String>();
    private Random rand = new Random(2);
    private int random_integer;

    public void setRandomFortunes(List<String> randomFortunes) {
        this.randomFortunes = List.of(randomFortunes.get(0).split(","));
    }

    @Override
    public String getFortune() {
        this.random_integer = rand.nextInt(3) + 0;
        return randomFortunes.get(random_integer);
    }
}
