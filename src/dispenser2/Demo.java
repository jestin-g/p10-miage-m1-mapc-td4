package dispenser2;

public class Demo {
    public static void main(String[] args) {
        DrinkDispenser dispenser = new DrinkDispenser();
        dispenser.askCoffee();
        dispenser.giveMoney(5);
        dispenser.giveMoney(10);
        dispenser.askCoffee();
        dispenser.getRefund();
    }
}
