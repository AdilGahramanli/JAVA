package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Dragon extends Ennemis implements ICase {
    private int dragonForce;

    public Dragon () {
        super(10, 8, 7);

    }


    @Override
    public String toString() {
        return "Dragon | Force " + getEnnemiForce();
    }

    @Override public int interact(Personnage personnage) {

        return personnage.getPersonnageLife() - getEnnemiForce();

    }
}
