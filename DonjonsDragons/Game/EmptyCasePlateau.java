package DonjonsDragons.Game;

import DonjonsDragons.Persos.Personnage;

public class EmptyCasePlateau implements ICase{
    public EmptyCasePlateau() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Case vide";
    }

    @Override
    public int interact (Personnage personnage) {

        return personnage.getPersonnageForce();
    }
}
