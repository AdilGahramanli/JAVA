package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;

public abstract class Potion implements ICase {
    private int lifePotion;

    public Potion(int lifeForce) {
        this.lifePotion = lifeForce;
    }

    public int getLifePotion() {
        return lifePotion;
    }

    //    public int getforcePotion() {
//        return this.forcePotion;
//    }

//    public String toString() {
//        return "Force potion : " + getforcePotion();
//    }
}
