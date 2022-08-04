package interfaces.implement.refills;

import interfaces.RefillInterface;

public class Coffee implements RefillInterface {



    @Override
    public String name() {
        return "coffee";
    }

    @Override
    public void dump() {
        System.out.println("Here are your coffee");
    }
}
