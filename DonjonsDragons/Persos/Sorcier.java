package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Sorcier extends Ennemis implements ICase {
    private int sorcierForce;

    public Sorcier () {
        this.sorcierForce = 7;

    }

    public int getSorcierForce () {
        return this.sorcierForce;
    }


    @Override
    public String toString() {
        return "Sorcier | Force = " + getSorcierForce();
    }


    @Override
    public int interact () {
        return getSorcierForce();
    }
}
