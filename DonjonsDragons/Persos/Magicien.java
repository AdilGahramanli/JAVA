package DonjonsDragons.Persos;

import DonjonsDragons.Game.ICase;

public class Magicien extends Personnage implements ICase {


    public Magicien(String name) {

        super(10, 78);
        setPersonnageName(name);
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

}

