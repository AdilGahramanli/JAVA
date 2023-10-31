package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Philtre extends EquipementDefensif implements ICase {
    private int philtreForce;
    public Philtre () {
        this.philtreForce = 5;
    }

    public int getPhiltreForce() {
        return philtreForce;
    }

    @Override
    public String toString() {
        return "Philtre | Force = " + getPhiltreForce();
    }
    @Override
    public int interact (Personnage personnage) {
        return getPhiltreForce();
    }
}
