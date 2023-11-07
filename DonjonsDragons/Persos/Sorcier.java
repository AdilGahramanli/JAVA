package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Sorcier extends Ennemis implements ICase {


    public Sorcier() {
        super(4, 7, 5);

    }



    @Override
    public String toString() {
        return "Sorcier | Force = " + getEnnemiForce();
    }


    @Override
    public int interact(Personnage personnage) {

        return personnage.minusPersonnageLife(this.getEnnemiForce());
    }
}
