package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class GrandePotion extends Potion implements ICase {

    public GrandePotion() {

        super(7);
    }


    @Override
    public String toString() {
        return "Grande Potion | " + getLifePotion();
    }

    @Override
    public int interact (Personnage personnage) {

        return personnage.bonusPersonnageLife(getLifePotion());
    }
}
