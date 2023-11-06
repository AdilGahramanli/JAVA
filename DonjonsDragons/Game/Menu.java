package DonjonsDragons.Game;

import DonjonsDragons.Persos.Guerrier;
import DonjonsDragons.Persos.Magicien;
import DonjonsDragons.Persos.Personnage;

import java.util.Scanner;

public class Menu {

    private String personnageScannerName;
//    private String personnageScannerType;
    Scanner scanner = new Scanner(System.in);

    /**
     * Le constructeur menu donne le choix de commencer ou pas une partie.
     * Si la réponse est oui, lance les étapes de création de personnage
     */

    public Menu() {
        System.out.println("Voulez-vous jouer une partie (o/n)?");
        String startChoice = scanner.nextLine();

        if (startChoice.equals("o")) {
            System.out.println("Choisissez un nom");
            personnageCreation(scanner.nextLine());
//            personnageType();

        } else {
            System.out.println("Vous avez choisi de ne pas jouer.");
        }

    }
/********************************************
    /**
     * Création du personnage
     */
/** Choix du nom du personnage */
    public String personnageCreation(String name) {
        this.personnageScannerName = name;
        System.out.println("votre personnage s'appellera " + personnageScannerName +
        "; si vous voulez changer, c'est trop tard");
        return personnageScannerName;
    }



    public String getPersonnageScannerName() {
        return personnageScannerName;
    }







}