package DonjonsDragons.Persos;

public class Magicien extends Personnage {

    private int magicienLifeLevel;
    private int magicienForce;

    public Magicien() {

        this.magicienLifeLevel = 10000;
        this.magicienForce = 2500;
    }

    public int getMagicienLifeLevel() {
        return magicienLifeLevel;
    }

    public int getMagicienForce() {
        return magicienForce;
    }

    @Override
    public String toString() {

        return "Personnage :" + getPersonnageName() + ", Niveau de vie : " + getMagicienLifeLevel()
                + ", Force : " + getMagicienForce();
    }
}

