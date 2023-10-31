package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Sort extends EquipementOffensif implements ICase {

    private int sortForce;

    public Sort() {
        this.sortForce = 5;
    }

    public int getSortForce() {
        return sortForce;
    }

    @Override
    public String toString() {
        return "Sort | Force = " + getSortForce();
    }

    @Override
    public int interact (Personnage personnage) {

        return getSortForce();
    }
}
