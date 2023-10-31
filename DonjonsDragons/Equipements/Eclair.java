package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Eclair extends EquipementOffensif implements ICase {

    private int eclairForce;

    public Eclair () {
        this.eclairForce = 5;
    }

    public int getEclairForce() {
        return eclairForce;
    }
    @Override
    public String toString() {
        return "Eclair | Force = " + getEclairForce();
    }

    @Override
    public int interact (Personnage personnage) {
        return getEclairForce();
    }
}
