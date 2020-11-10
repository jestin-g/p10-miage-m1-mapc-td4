package dispenser1;

public class State {

    public void askCoffee(DrinkDispenser dispenser) {
        System.out.println("Can't serve coffee");
    }

    public void askTea(DrinkDispenser dispenser) {
        System.out.println("Can't serve tea");
    }

    public void giveMoney(DrinkDispenser dispenser, int money) {
        System.out.println("Can't accept money");
    }
}
