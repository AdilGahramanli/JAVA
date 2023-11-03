package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public abstract class Ennemis implements ICase {

    private int ennemiLife;
    private int ennemiForce;

    private int ennemiDefense;

    public Ennemis(int life, int force, int defense) {
        this.ennemiLife = life;
        this.ennemiForce = force;
        this.ennemiDefense = defense;

    }

    public int getEnnemiForce() {
        return ennemiForce;
    }
    @Override
    public abstract String toString();


    public abstract int interact(Personnage personnage);


}
