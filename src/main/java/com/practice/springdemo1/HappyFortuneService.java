package com.practice.springdemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
    //create a list of strings and assign some data to it
    private List<String> randomFortunes = new ArrayList<String>();
    private final Random rand = new Random(2);

    public void setRandomFortunes(List<String> randomFortunes) {
        this.randomFortunes = List.of(randomFortunes.get(0).split(","));
    }

    @Override
    public String getFortune() {
        int random_integer = rand.nextInt(randomFortunes.size()-1);
        return randomFortunes.get(random_integer);
    }
}
