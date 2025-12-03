package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Predator predator;
    private Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    public Lion(Predator predator) {

        this.predator = predator;
    }
    public  int getKittens(){
        return predator.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public Lion(Feline feline) {

        this.feline = feline;
    }
    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}