package entities;

import interfaces.Birds;

public class Penguin implements Birds {


    @Override
    public void eat() {
        System.out.println("I can eat");
    }

    @Override
    public void sleep() {
        System.out.println("I can sleep");
    }
}
