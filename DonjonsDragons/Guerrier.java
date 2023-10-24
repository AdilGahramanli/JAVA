package DonjonsDragons;


public class Guerrier extends Personnage {
    /**
     * Création d'un nouveau constructeur spécialement pour Guerrier
     */


    private int guerrierLifeLevel;
    private int guerrierForce;

    public Guerrier() {

        this.guerrierLifeLevel = 10000;
        this.guerrierForce = 2500;
        this.personnageName="toto";
    }

    public int getGuerrierLifeLevel() {
        return guerrierLifeLevel;
    }

    public int getGuerrierForce() {
        return guerrierForce;
    }


    @Override
    public String toString() {
        return "Personage :" + getPersonnageName() + ", Niveau de vie : " + getGuerrierLifeLevel() +
                ", Force : " + getGuerrierForce();
    }
}
