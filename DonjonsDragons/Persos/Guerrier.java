package DonjonsDragons.Persos;


public class Guerrier extends Personnage {
    /**
     * Création d'un nouveau constructeur spécialement pour Guerrier
     */


    private int guerrierLifeLevel;
    private int guerrierForce;

    public Guerrier(String name) {
        setPersonnageName(name);
        this.guerrierLifeLevel = 10000;
        this.guerrierForce = 2500;

    }

    public int getGuerrierLifeLevel() {
        return guerrierLifeLevel;
    }

    public int getGuerrierForce() {
        return guerrierForce;
    }


    @Override
    public String toString() {
        return "Personnage :" + getPersonnageName() + ", Niveau de vie : " + getGuerrierLifeLevel() +
                ", Force : " + getGuerrierForce();
    }
}
