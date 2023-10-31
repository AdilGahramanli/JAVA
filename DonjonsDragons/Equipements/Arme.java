package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Arme extends EquipementOffensif implements ICase {

    private int armeForce;

    public Arme () {
        this.armeForce = 3;
    }

    public int getArmeForce () {
        return armeForce;
    }
    @Override
    public String toString() {
        return "Arme | Force = " + getArmeForce();
    }

    @Override
    public int interact (Personnage personnage) {
        return getArmeForce();
    }
//    @Override
//    public void interact() {
//
//    }
}
