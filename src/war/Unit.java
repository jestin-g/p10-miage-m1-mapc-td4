package war;

import java.util.ArrayList;

public class Unit {

    public String name;
    public Attack stuff;
    public Movements moves;

    public Unit(String name) {
        this.name = name;
    }

    public void toMove() {
        this.moves.toMove();
    }

    public void toAttack() {
        this.stuff.toAttack();
    }

    public void giveStuff(Attack newAttack) {
        this.stuff = newAttack;
    }

    public void setMoves(Movements newMoves) {
        this.moves = newMoves;
    }
}
