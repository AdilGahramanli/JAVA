package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class GrandePotion extends Potion implements ICase {
    private int grandePotionForce;

    public GrandePotion() {
        this.grandePotionForce = 5;
    }

    public int getGrandePotionForce() {
        return grandePotionForce;
    }
    @Override
    public String toString() {
        return "Grande Potion | " + getGrandePotionForce();
    }

    @Override
    public int interact (Personnage personnage) {
        return getGrandePotionForce();
    }
}
