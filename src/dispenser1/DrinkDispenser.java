package dispenser1;

public class DrinkDispenser {

    private State state;
    public int moneyEntered;

    public static final int DRINK_PRICE = 10;

    public DrinkDispenser() {
        this.state = new StateWaitingForMoney();
        this.moneyEntered = 0;
    }

    public void giveMoney(int money) {
        this.state.giveMoney(this, money);
    }

    public void askCoffee() {
        this.state.askCoffee(this);
    }

    public void askTea() {
        this.state.askTea(this);
    }

    public void setState(State state) {
        this.state = state;
    }

}
