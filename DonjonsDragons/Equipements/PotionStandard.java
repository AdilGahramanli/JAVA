package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class PotionStandard extends Potion implements ICase {

    private int potionForce;

    public PotionStandard() {
        this.potionForce = 5;
    }

    public int getPotionForce() {
        return potionForce;
    }

    @Override
    public String toString() {
        return "Potion | Force = " + getPotionForce();
    }
    @Override
    public int interact (Personnage personnage) {
        return getPotionForce();
    }
}
