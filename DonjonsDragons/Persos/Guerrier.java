package DonjonsDragons.Persos;


public class Guerrier extends Personnage {
    /**
     * Création d'un nouveau constructeur spécialement pour Guerrier
     */


    public Guerrier(String name) {

        //on fait appel au constructeur de personnage en redéfinissant les valeurs.
    super(10, 58);
        setPersonnageName(name);
    }




    @Override
    public String toString() {
        return "Personnage de type Guerrier :" + getPersonnageName() + ", Niveau de vie : " + getPersonnageLife() +
                ", Force : " + getPersonnageForce();
    }

    @Override
    public int interact ( Personnage  personnage ) {
        return 1;
    }
}
