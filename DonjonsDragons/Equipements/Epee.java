package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Epee extends EquipementOffensif implements ICase {

    private int epeeForce;

    public Epee() {
        this.epeeForce = 4;
    }

    public int getEpeeForce() {
        return epeeForce;
    }
    @Override
    public String toString() {
        return "Epee | Force = " + getEpeeForce();
    }

    @Override
    public int interact (Personnage personnage) {
        return getEpeeForce();
    }
}
