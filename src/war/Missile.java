package war;

public class Missile implements Attack{
    @Override
    public void toAttack() {
        System.out.println("Fire missile");
    }
}
