package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Sort extends EquipementOffensif implements ICase {


    public Sort() {

        super(8);
    }



    @Override
    public String toString() {
        return "Sort | Force = " + getAttackLevel();
    }

    @Override
    public int interact (Personnage personnage) {
        if (personnage instanceof DonjonsDragons.Persos.Magicien)
        {return personnage.addPersonnageForce(this.getAttackLevel());}
        else { return 0;}
    }
}
