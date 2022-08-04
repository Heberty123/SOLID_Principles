import Exceptions.RefillEmpyt;
import entities.CoffeeMachine;
import interfaces.implement.refills.Coffee;

public class program {
    public static void main(String[] args) {
        System.out.println("understanding DIP with coffee machine context\n\n");

        Coffee coffee = new Coffee(); // It's low level that is instanciated only here

        CoffeeMachine machine = new CoffeeMachine(); // It's high level instantiated
        machine.putRefill(coffee); // We injected low level (Dependency)

        try{
            machine.BrewNow(); // Calling method
        }
        catch (RefillEmpyt e){
            System.out.println("Pay Attention: " + e.getMessage());
        }
    }
}
