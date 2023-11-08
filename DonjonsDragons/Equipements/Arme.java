package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;
import org.w3c.dom.ls.LSOutput;

/** Classe Arme enfant d'équipementOffensif @see Equipements.EquipementDefensif */
public class Arme extends EquipementOffensif implements ICase {


    public Arme () {
        super(3);
    }

    @Override
    public String toString() {
        return "Arme | Force = " + getAttackLevel();
    }

    @Override
    public int interact (Personnage personnage) {
        if(personnage instanceof DonjonsDragons.Persos.Guerrier) {
            return  personnage.getPersonnageForce() + getAttackLevel();
        }
        else { return 0;}

    }
//    @Override
//    public void interact() {
//
//    }
}
