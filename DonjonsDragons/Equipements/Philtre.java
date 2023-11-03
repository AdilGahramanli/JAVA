package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Philtre extends EquipementDefensif implements ICase {
    private int philtreForce;
    public Philtre () {

        super(8);
    }



    @Override
    public String toString() {
        return "Philtre | Force = " + getDefenseLevel();
    }
    @Override
    public int interact (Personnage personnage) {

        return personnage.bonusPersonnageLife(getDefenseLevel());
    }
}
