package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Massue extends EquipementOffensif implements ICase {
    private int massueForce;

    public Massue () {
        this.massueForce=7;
    }

    public int getMassueForce () {
        return massueForce;
    }
    @Override
    public String toString() {
        return "Massue | Force = " + getMassueForce();
    }

    @Override
    public int interact (Personnage personnage) {
        return getMassueForce();
    }
}
