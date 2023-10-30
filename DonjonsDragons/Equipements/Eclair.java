package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;

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
    public int interact () {
        return getEclairForce();
    }
}
