package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public abstract class Personnage implements ICase {
    private String personnageName;
    private int personnageForce;
    private int personnageLife;


    public Personnage(int force, int life) {
        this.personnageLife = life;
        this.personnageForce = force;
    }


    //SETTERS et GETTERS

    public void setPersonnageName(String name) {
        personnageName = name;
    }

    public String getPersonnageName() {
        return personnageName;
    }

    public int getPersonnageLife() {
        return personnageLife;
    }

    public int getPersonnageForce() {
        return personnageForce;
    }

    public int addPersonnageForce(int force) {
       return personnageForce = personnageForce + force;
    }

    public int bonusPersonnageLife(int life) {
        return personnageLife = personnageLife + life;
    }

    public int minusPersonnageLife(int ennemiAttack) {
        return personnageLife = personnageLife - ennemiAttack;
    }

    public int minusPersonnageForce(int ennemiDefense) {
        return personnageForce = personnageForce - ennemiDefense;
    }



//    @Override
//    public abstract String toString();

//    @Override
//    public int interact(Personnage personnage) {
//        return 1;
//    }

}


//magicien a 3 à 6, guerier de 5 à 10;