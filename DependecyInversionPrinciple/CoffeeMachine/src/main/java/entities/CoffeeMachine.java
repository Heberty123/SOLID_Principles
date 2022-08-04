package entities;

import Exceptions.RefillEmpyt;
import interfaces.RefillInterface;

public class CoffeeMachine {

    RefillInterface refill;


    public void BrewNow(){
        if(refill == null)
            throw new RefillEmpyt("You don't put any refill yet, please to do it !");
        System.out.println("It's discarging " + refill.name());
        refill.dump();
    }

    public void putRefill(RefillInterface refill){
        this.refill = refill;
    }

}
