package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class BouleDeFeu extends EquipementOffensif implements ICase {
    private int bouleDeFeuForce;

    public BouleDeFeu () {

        super(5);
    }

    public int getBouleDeFeuForce () {
        return bouleDeFeuForce;
    }
    @Override
    public String toString() {
        return "Boule de Feu | Force = " + getBouleDeFeuForce();
    }
    @Override
    public int interact (Personnage personnage) {
        if (personnage instanceof DonjonsDragons.Persos.Magicien)
         return personnage.addPersonnageForce(this.getAttackLevel());
        else { return 0;}
    }
}
