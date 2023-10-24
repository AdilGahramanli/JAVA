package DonjonsDragons;

import java.util.Scanner;

public class Main {
    /**
     * structurer correctement le déroulement
     * du jeu et les messages pour l’utilisateur en utilisant des fonctions.
     */


    public static void main(String[] args) throws PersonnageHorsPlateauException {
        /* on déclare un nouveau menu et un nouveau game. Comment faire des blocs de menu ?*/

        Menu menu = new Menu();
        Game game = new Game();


//        menu.personnageCreation();


    }
//for(int i=0; i<5; i++) {


    //On crée un new menu, début du jeu
//        System.out.println("Voulez vous démarrer une nouvelle partie ?");


//        Scanner scannerStart = new Scanner(System.in);
//        String answer = scannerStart.nextLine();
//        if (answer.equals("oui")) {

//            while (answer.equals("oui")) {
//                menu.personnageCreation();
//                Personnage personnage = new Personnage(menu.personnageScannerName, menu.personnageScannerType);
//                menu.personnageInforming(personnage);
////                toString(Personnage personnage, Menu menu);
//                System.out.println("Voulez-vous modifier vos infos ?");
//                answer = scannerStart.nextLine();
//                if (answer.equals("oui")) {
//                    menu.personnageCreation();
//                    System.out.println("Maintenant c'est parti pour le jeu !");
//                    while(game.PersonnageMove() <64 ) {
//                        game.PersonnageMove();
//
//                    }
//                    menu.quitOrNot(game.gameOrNot());
//
//
//                }
//                else {
//                    System.out.println("Vous voulez quitter ?");
//                    answer = scannerStart.nextLine();
//                    if (answer.equals("oui")) {
//
//                        System.out.println("Bye Gamer !");
//                    }
//                    else {
//                        System.out.println("Alors c'est parti pour le jeu !");
//                        while(game.PersonnageMove() <64 ) {
//                            game.PersonnageMove();
//
//                        }
//                        menu.quitOrNot(game.gameOrNot());
//                    }
//
//                }
//
//            }
//        }
//
//        else{
//            System.out.println("Tant pis on jouera une autre fois !");}
//    }


}