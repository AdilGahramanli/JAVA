package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;

public class Bouclier extends EquipementDefensif implements ICase {
    private int force;
    public Bouclier() {
        this.force = 10;


    }

    @Override
    public String toString() {
        return "Force Bouclier :" +getForceBouclier();
    }

    public int getForceBouclier() {
        return force;
    }
}
