package interfaces.implement.refills;

import interfaces.RefillInterface;

public class HotChocolate implements RefillInterface {


    @Override
    public String name() {
        return "Hot Chocolate";
    }

    @Override
    public void dump() {
        System.out.println("Here are your hot chocolate");
    }
}
