package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;

public abstract class Potion implements ICase {
    private int forcePotion;

    public Potion() {
        this.forcePotion = 5;
    }

    public int getforcePotion() {
        return this.forcePotion;
    }

    public String toString() {
        return "Force potion : " + getforcePotion();
    }
}
