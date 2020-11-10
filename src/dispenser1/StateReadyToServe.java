package dispenser1;

public class StateReadyToServe extends State {

    public StateReadyToServe() {
        System.out.println("Ready to serve drink...");
    }

    @Override
    public void askCoffee(DrinkDispenser dispenser) {
        this.serveDrink(dispenser, "Coffee");
    }

    public void askTea(DrinkDispenser dispenser) {
        this.serveDrink(dispenser, "Tea");
    }

    private void serveDrink(DrinkDispenser dispenser, String drinkType) {
        System.out.println(drinkType + " served");
        dispenser.moneyEntered = 0;
        dispenser.setState(new StateWaitingForMoney());
    }
}
