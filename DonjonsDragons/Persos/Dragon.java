package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Dragon extends Ennemis implements ICase {
    private int dragonForce;

    public Dragon () {
        this.dragonForce = 9;

    }

    public int getDragonForce() {
        return dragonForce;
    }
    @Override
    public String toString() {
        return "Dragon | Force " + getDragonForce();
    }

    @Override public int interact() {
        return getDragonForce();
    }
}
