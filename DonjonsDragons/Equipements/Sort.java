package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Sort extends EquipementOffensif implements ICase {

    private int sortForce;

    public Sort() {

        super(8);
    }



    @Override
    public String toString() {
        return "Sort | Force = " + getAttackLevel();
    }

    @Override
    public int interact (Personnage personnage) {

        return personnage.addPersonnageForce(this.getAttackLevel());
    }
}
