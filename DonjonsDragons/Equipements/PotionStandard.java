package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class PotionStandard extends Potion implements ICase {


    public PotionStandard() {

        super(5);
    }


    @Override
    public String toString() {
        return "Potion | Force = " + getLifePotion();
    }
    @Override
    public int interact (Personnage personnage) {

        return personnage.bonusPersonnageLife(getLifePotion());
    }
}
