package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;
import DonjonsDragons.Game.TypeResult;

public class Goblin extends Ennemis implements ICase, TypeResult {
    private int goblinForce;

    public Goblin() {
        this.goblinForce = 5;
//        this.getClass();
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
        if (personnage instanceof Magicien) {
            ((Magicien) personnage).setMagicienLifeLevel(getGoblinForce()); }
    return personnage.getPersonnageLife();}

    @Override
    public Class typeResult () {
        return this.getClass();
    }
}
