package DonjonsDragons;

import DonjonsDragons.Game.Game;
import DonjonsDragons.Game.ICase;
import DonjonsDragons.Game.Menu;
import DonjonsDragons.Game.Plateau;
import DonjonsDragons.Persos.Personnage;
import DonjonsDragons.Persos.PersonnageHorsPlateauException;

/** @author author Adil G */
/** <b>Classe main </b> chargée de lancer le jeu */
public class Main implements ICase {
    /**
     * structurer correctement le déroulement
     * du jeu et les messages pour l’utilisateur en utilisant des fonctions.
     */


    public static void main(String[] args) throws PersonnageHorsPlateauException {
        /* on déclare un nouveau menu et un nouveau game. Comment faire des blocs de menu ?*/

//        Menu menu = new Menu();
        Game game = new Game();



    }

    @Override
    public String toString() {
        return "MAIN";
    }

    @Override
    public int interact(Personnage personnage) {
        return 1;
    }

}