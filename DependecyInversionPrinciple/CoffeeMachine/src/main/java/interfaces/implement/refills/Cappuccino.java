package interfaces.implement.refills;

import interfaces.RefillInterface;

public class Cappuccino implements RefillInterface {


    @Override
    public String name() {
        return "Cappuccino";
    }

    @Override
    public void dump() {
        System.out.println("Here are your cappuccino");
    }
}
