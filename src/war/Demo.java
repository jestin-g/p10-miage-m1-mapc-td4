package war;

public class Demo {
    public static void main(String[] args) {
        Unit bob = new Unit("Bob");
        bob.setMoves(new Run());
        bob.giveStuff(new SMG());
        bob.toMove();
        bob.toAttack();

        Unit superCopter = new Unit("SuperCopter");
        superCopter.setMoves(new Fly());
        superCopter.giveStuff(new Missile());
        superCopter.toMove();
        superCopter.toAttack();
    }
}
