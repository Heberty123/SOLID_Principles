package entities;

import interfaces.Birds_that_fly;

public class Owl implements Birds_that_fly {


    @Override
    public void eat() {
        System.out.println("I can eat");
    }

    @Override
    public void sleep() {
        System.out.println("I can sleep");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
