package dispenser2;

public class State {

    public void askCoffee(DrinkDispenser dispenser) {
        System.out.println("Can't dispense coffee");
    }

    public void askTea(DrinkDispenser dispenser) {
        System.out.println("Can't dispense tea");
    }

    public void giveMoney(DrinkDispenser dispenser, int money) {
        System.out.println("Can't accept money");
    }

    public void getRefund(DrinkDispenser dispenser) {
        System.out.println(dispenser.moneyEntered + "$ refunded");
        dispenser.moneyEntered = 0;
        dispenser.setState(new StateWaitingForMoney());
    }
}
