package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Magicien extends Personnage implements ICase {
    private int magicienLifeLevel;

    private String magicienName;
    private int magicienForce;

    public Magicien(String name) {

        super(10, 8);
        setPersonnageName(name);
//
//        setPersonnageName(name);
//
//        this.magicienName = getPersonnageName();
//
//        this.magicienLifeLevel = 10;
//
//        this.magicienForce = 2500;
    }

//    public int getMagicienLifeLevel() {
//        return magicienLifeLevel;
//    }
//
//    public void setMagicienLifeLevel (int ennemyForce) {
//        magicienLifeLevel = magicienLifeLevel - ennemyForce;
//    }

    public int getMagicienForce() {
        return magicienForce;
    }

    public String getMagicienName () {
        return getPersonnageName();
    }

    @Override
    public String toString() {

        return "Personnage de type Magicien :" + getPersonnageName() + ", Niveau de vie : " + getPersonnageLife()
                + ", Force : " + getPersonnageForce();
    }

    @Override
    public int interact(Personnage personnage) {
        return 1;
    }
//    public void changeName(String menuName) {
//         setPersonnageName(menuName);
//    }
}

