import java.util.Scanner;

public class Menu {
    boolean gameStart;

    String personnageScannerName;
    String personnageScannerType;
    Scanner scanner_Name = new Scanner(System.in);
    Scanner scanner_Type = new Scanner(System.in);
    Scanner scannerStart = new Scanner(System.in);

    public void personnageCreation() {
        System.out.println("Bienvenue dans le jeu, veuillez choisir un nom pour votre avatar");
        personnageScannerName = scanner_Name.nextLine();
        System.out.println("votre personnage s'appellera " + personnageScannerName);

        System.out.println("Veuillez choisir un type. Tapez 'M' pour Magicien ou 'W' pour guerrier");
        personnageScannerType = scanner_Type.nextLine();


    }

    public void personnageInforming(Personnage perso) {
        System.out.println("Voulez-vous en savoir plus sur votre personnage ?");

        String answer = scannerStart.nextLine();

        if (answer.equals("oui")) {
            System.out.println("Super ! Votre personnage s'appelle " + personnageScannerName + " et votre type de personnage est " +
                    perso.getPersonnageType(personnageScannerType) +  " !");
        }

    }

    public void quitOrNot(String choix) {
        if (choix.equals("recommencer")) {
            personnageCreation();
        }
        else {
            System.out.println("Vous avez choisi de quitter. Ciao !");
        }
    }

}