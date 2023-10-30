package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Magicien extends Personnage implements ICase {
    private int magicienLifeLevel;
    private int magicienForce;

    public Magicien(String name) {
     setPersonnageName(name);
        this.magicienLifeLevel = 10;
//        this.magicienForce = 2500;
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
    @Override
    public int interact() {
        return getMagicienLifeLevel();
    }
//    public void changeName(String menuName) {
//         setPersonnageName(menuName);
//    }
}

