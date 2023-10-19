import java.util.Scanner;

public class Main {
    /**
     * structurer correctement le déroulement
     * du jeu et les messages pour l’utilisateur en utilisant des fonctions.
     */
    Scanner scannerStart;
    String answer;


    public static void main(String[] args) {
        System.out.println("Voulez vous démarrer une nouvelle partie ?");
        Menu menu = new Menu();
        Scanner scannerStart = new Scanner(System.in);
        String answer = scannerStart.nextLine();
        if (answer.equals("oui")) {

            while (answer.equals("oui")) {
                menu.personnageCreation();
                Personnage personnage = new Personnage(menu.personnageScannerName, menu.personnageScannerType);
                menu.personnageInforming(personnage);
//                toString(Personnage personnage, Menu menu);
                System.out.println("Voulez-vous modifier vos infos ?");
                answer = scannerStart.nextLine();
                if (answer.equals("oui")) {
                    menu.personnageCreation();
                }
                else {
                    System.out.println("Vous voulez quitter ?");
                    answer = scannerStart.nextLine();
                    
                }
//
////Début du jeu
//            System.out.println("Bienvenue dans le jeu, veuillez choisir un nom pour votre avatar");
//            menu.personnageScannerName = menu.scanner_Name.nextLine();
//            System.out.println("votre personnage s'appellera " + menu.personnageScannerName);
//
//            System.out.println("Veuillez choisir un type. Tapez 'M' pour Magicien ou 'W' pour guerrier");
//            menu.personnageScannerType = menu.scanner_Type.nextLine();
//            Personnage personnage = new Personnage(menu.personnageScannerName, menu.personnageScannerType);
//            System.out.println("Voulez-vous en savoir plus sur votre personnage ?");
//            answer = scannerStart.nextLine();
//
//            if (answer.equals("oui")) {
//                System.out.println("Super ! Votre personnage s'appelle " + menu.personnageScannerName + " et votre type de personnage est " +
//                        personnage.getPersonnageType(menu.personnageScannerType) + " !");
////MODIFIER infos

//
//                System.out.println("Vous voulez quitter ?");
//                answer = scannerStart.nextLine();
//                if (answer.equals("oui")) {
//                    System.out.println("Bye !");
//                }
//            } else {
//                System.out.println("Vous voulez quitter ?");
//                answer = scannerStart.nextLine();
//                if (answer.equals("oui")) {
//                    System.out.println("Bye !");
//                }
//            }
//        }

//    }
            }
        }

        else{
            System.out.println("Tant pis on jouera une autre fois !");}
    }

    public String toString(Personnage perso, Menu menu) {
        return "Ton personnage s'appelle" + menu.personnageScannerName + "votre type est " + perso.getPersonnageType(menu.personnageScannerType);
    }
}