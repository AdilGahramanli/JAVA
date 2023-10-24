package DonjonsDragons;

import DonjonsDragons.Persos.Guerrier;
import DonjonsDragons.Persos.Magicien;
import DonjonsDragons.Persos.Personnage;

import java.util.Scanner;

public class Menu {

    private String personnageScannerName;
    private String personnageScannerType;
    Scanner scanner_Name = new Scanner(System.in);
    Scanner scanner_Type = new Scanner(System.in);
    Scanner scannerStart = new Scanner(System.in);


    /************************************************************************/
    /**
     * Le constructeur menu donne le choix de commencer ou pas une partie, et
     * si la réponse est oui, lance les étapes de création de personnage
     */

    public Menu() {
        System.out.println("Voulez-vous jouer une partie (o/n)?");
        String startChoice = scannerStart.nextLine();

        if (startChoice.equals("o")) {
            personnageCreation();
            personnageType();
        } else {
            System.out.println("Vous avez choisi de ne pas jouer.");
        }
    }
/********************************************
    /**
     * Création du personnage
     */
    /*Nom du personnage*/
    public String personnageCreation() {
        System.out.println("Bienvenue dans le jeu, veuillez choisir un nom pour votre avatar");
        personnageScannerName = scanner_Name.nextLine();
        System.out.println("votre personnage s'appellera " + personnageScannerName);
        return personnageScannerName;
    }

    /*Choisir un type de personnage et lancer l création du personnage*/
    public void personnageType() {
        System.out.println("Veuillez choisir un type. Tapez 'm' pour Magicien ou 'g' pour Guerrier");
        personnageScannerType = scanner_Type.nextLine();

        if (personnageScannerType.equals("m")) {

            Personnage magicien = new Magicien();
            magicien.setPersonnageName(personnageScannerName);
            System.out.println(magicien.toString());

        } else if (personnageScannerType.equals("g")) {

            Personnage guerrier = new Guerrier();
            guerrier.setPersonnageName(personnageScannerName);
            System.out.println(guerrier.toString());

        } else {
            personnageType();
        }
    }


}