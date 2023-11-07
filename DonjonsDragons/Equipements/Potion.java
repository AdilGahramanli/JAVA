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


}
