package dispenser1;

public class Demo {
    public static void main(String[] args) {
        DrinkDispenser dispenser = new DrinkDispenser();

        dispenser.askCoffee();
        dispenser.giveMoney(5);
        dispenser.askCoffee();
        dispenser.giveMoney(30);
        dispenser.askCoffee();
        dispenser.giveMoney(1);
        dispenser.askTea();
    }
}
