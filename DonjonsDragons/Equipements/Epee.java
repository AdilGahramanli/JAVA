package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Epee extends EquipementOffensif implements ICase {

    private int epeeForce;

    public Epee() {
        super(5);
    }

    public int getEpeeForce() {
        return epeeForce;
    }
    @Override
    public String toString() {
        return "Epee | Force = " + getAttackLevel();
    }

    @Override
    public int interact (Personnage personnage) {
        return personnage.addPersonnageForce(this.getAttackLevel());
    }
}
