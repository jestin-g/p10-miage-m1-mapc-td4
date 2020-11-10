package dispenser2;

public class StateWaitingForMoney extends State {

    public StateWaitingForMoney() {
        System.out.println("Waiting for money...");
    }

    @Override
    public void giveMoney(DrinkDispenser dispenser, int money) {
        dispenser.moneyEntered += money;
        System.out.println(money + "$ entered");
        if (dispenser.moneyEntered >= DrinkDispenser.DRINK_PRICE)
            dispenser.setState(new StateReadyToServe());
    }
}
