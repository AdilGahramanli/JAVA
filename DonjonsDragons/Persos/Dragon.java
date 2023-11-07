package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Dragon extends Ennemis implements ICase {

    public Dragon () {
        super(10, 8, 7);

    }


    @Override
    public String toString() {
        return "Dragon | Force " + this.getEnnemiForce();
    }

    @Override public int interact(Personnage personnage) {

        return personnage.minusPersonnageLife(this.getEnnemiForce());

    }
}
