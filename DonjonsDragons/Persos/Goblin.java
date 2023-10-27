package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Goblin extends Ennemis implements ICase {
    private int goblinForce;

    public Goblin() {
        this.goblinForce = 5;
    }

    public int getGoblinForce () {
        return goblinForce;
    }
    @Override
    public String toString() {
        return "Goblin - Force = " + getGoblinForce();
    }
}
