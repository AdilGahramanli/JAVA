package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;

public class Bouclier extends EquipementDefensif implements ICase {
    private int force;
    public Bouclier() {
        super(5);


    }

    @Override
    public String toString() {
        return "Force Bouclier :" +getDefenseLevel();
    }

    @Override
    public int interact (Personnage personnage) {
        if(personnage instanceof DonjonsDragons.Persos.Guerrier){
            return personnage.bonusPersonnageLife(getDefenseLevel());
        }
        else{
            return 0;
        }

    }

    public int getForceBouclier() {
        return force;
    }


}
