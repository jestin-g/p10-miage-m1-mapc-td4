package dispenser2;

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
        dispenser.moneyEntered -= DrinkDispenser.DRINK_PRICE;
        System.out.println(drinkType + " served");
        this.getRefund(dispenser);
    }
}
