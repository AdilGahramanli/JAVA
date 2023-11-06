package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Persos.Personnage;
import org.w3c.dom.ls.LSOutput;

/** Classe Arme enfant d'équipementOffensif @see Equipements.EquipementDefensif */
public class Arme extends EquipementOffensif implements ICase {

    private int armeForce;

    public Arme () {
        super(3);
    }

    public int getArmeForce () {
        return armeForce;
    }
    @Override
    public String toString() {
        return "Arme | Force = " + getArmeForce();
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
