package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Eclair extends EquipementOffensif implements ICase {



    public Eclair () {

        super(5);
    }


    @Override
    public String toString() {
        return "Eclair | Force = " + getAttackLevel();
    }

    @Override
    public int interact (Personnage personnage) {
        if (personnage instanceof DonjonsDragons.Persos.Magicien) {
        return personnage.addPersonnageForce(this.getAttackLevel());}
        else {return 0;}
    }
}
