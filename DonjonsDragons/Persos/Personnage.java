package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public abstract class Personnage implements ICase {
    private String personnageName = "bibi";
    private int personnageForce;
    private int personnageLife;
    private String personnageArme;


    public Personnage() {

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

    public String getPersonnageArme() {
        return personnageArme;
    }


//    @Override
//    public abstract String toString();

    @Override
    public int interact(Personnage personnage) {
        return 1;
    }

}


//magicien a 3 à 6, guerier de 5 à 10;