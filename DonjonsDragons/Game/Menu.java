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
     * Le constructeur menu donne le choix de commencer ou pas une partie, et
     * si la réponse est oui, lance les étapes de création de personnage
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

    public String personnageCreation(String name) {
        this.personnageScannerName = name;
        System.out.println("votre personnage s'appellera " + personnageScannerName +
        "; si vous voulez changer, c'est trop tard");
        return personnageScannerName;
    }

    /*Choisir un type de personnage et lancer l création du personnage*/
//    public void personnageType() {
//        System.out.println("Veuillez choisir un type. Tapez 'm' pour Magicien ou 'g' pour Guerrier");
//        String personnageScannerType = scanner.nextLine();
//
//        if (personnageScannerType.equals("m")) {
//
//            Personnage magicien = new Magicien(getPersonnageScannerName());
//            magicien.setPersonnageName(personnageScannerName);
//            System.out.println(magicien.toString());
//
//        } else if (personnageScannerType.equals("g")) {
//
//            Personnage guerrier = new Guerrier(getPersonnageScannerName());
//            guerrier.setPersonnageName(getPersonnageScannerName());
//            System.out.println(guerrier.toString());
//
//        } else {
//            personnageType();
//        }
//    }

    public String getPersonnageScannerName() {
        return personnageScannerName;
    }


}