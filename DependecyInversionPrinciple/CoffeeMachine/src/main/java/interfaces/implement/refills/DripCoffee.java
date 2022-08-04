package interfaces.implement.refills;

import interfaces.RefillInterface;

public class DripCoffee implements RefillInterface {


    @Override
    public String name() {
        return "drip coffee";
    }

    @Override
    public void dump() {
        System.out.println("Here are your drip coffee");
    }
}
