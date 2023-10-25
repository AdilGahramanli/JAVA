package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;

public class Potion implements ICase {
    private int forcePotion;

    public Potion() {
        this.forcePotion = 5;
    }

    public int getforcePotion() {
        return this.forcePotion;
    }
    @Override
    public String toString() {
        return "Force potion : " + getforcePotion();
    }
}
