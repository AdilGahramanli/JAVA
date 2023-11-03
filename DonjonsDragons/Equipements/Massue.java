package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Massue extends EquipementOffensif implements ICase {


    public Massue () {

        super(7);

    }



    @Override
    public String toString() {
        return "Massue | Force = " + getAttackLevel();
    }

    @Override
    public int interact (Personnage personnage) {
        return personnage.addPersonnageForce(this.getAttackLevel());
    }
}
