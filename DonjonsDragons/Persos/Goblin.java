package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Goblin extends Ennemis implements ICase {
    private int goblinForce;

    public Goblin() {
        super (5, 4, 2);
    }

    public int getGoblinForce () {
        return goblinForce;
    }
    @Override
    public String toString() {
        return "Goblin | Force = " + getGoblinForce();
    }
    @Override
    public int interact (Personnage personnage) {
        //action spécifique au goblin
        return personnage.getPersonnageLife() - getEnnemiForce();

    }

}
