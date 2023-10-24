package DonjonsDragons.Persos;

public abstract class Personnage {
    private String personnageName;
    private int personnageForce;
    private int personnageLife;
    private String personnageArme;


    public Personnage() {

    }


    //SETTERS et GETTERS

    public void setPersonnageName(String name) { personnageName = name; }

    public String getPersonnageName() {
        return personnageName;
    }

    public int getPersonnageLife() { return personnageLife; }

    public int getPersonnageForce() { return personnageForce; }

    public String getPersonnageArme() { return personnageArme; }

    public String toString() {
        return "Personnage : " + getPersonnageName() + ", Niveau de Vie : " + getPersonnageLife() +
                ", Force : " + getPersonnageForce();
    }
}


//magicien a 3 à 6, guerier de 5 à 10;