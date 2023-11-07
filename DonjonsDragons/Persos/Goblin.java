package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Goblin extends Ennemis implements ICase {

    public Goblin() {
        super (5, 4, 2);
    }


    @Override
    public String toString() {
        return "Goblin | Force = " + this.getEnnemiForce();
    }
    @Override
    public int interact (Personnage personnage) {
        //action spécifique au goblin
        return personnage.minusPersonnageLife(this.getEnnemiForce());

    }

}
