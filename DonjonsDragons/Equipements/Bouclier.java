package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Bouclier extends EquipementDefensif implements ICase {
    private int force;
    public Bouclier() {
        this.force = 10;


    }

    @Override
    public String toString() {
        return "Force Bouclier :" +getForceBouclier();
    }

    @Override
    public int interact (Personnage personnage) {
        return getForceBouclier();
    }

    public int getForceBouclier() {
        return force;
    }


}
