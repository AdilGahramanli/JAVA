import java.util.Scanner;

public class Main {
    /**
     * structurer correctement le déroulement
     * du jeu et les messages pour l’utilisateur en utilisant des fonctions.
     */
    Scanner scannerStart;
    String answer;



    public static void main(String[] args) {
    Game game = new Game();


    //On crée un new menu, début du jeu
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
                    System.out.println("Maintenant c'est parti pour le jeu !");
                    while(game.PersonnageMove() <64 ) {
                        game.PersonnageMove();

                    }
                    menu.quitOrNot(game.gameOrNot());
                    

                }
                else {
                    System.out.println("Vous voulez quitter ?");
                    answer = scannerStart.nextLine();
                    if (answer.equals("oui")) {

                        System.out.println("Bye Gamer !");
                    }
                    else {
                        System.out.println("Alors c'est parti pour le jeu !");
                        while(game.PersonnageMove() <64 ) {
                            game.PersonnageMove();

                        }
                        menu.quitOrNot(game.gameOrNot());
                    }
                    
                }

            }
        }

        else{
            System.out.println("Tant pis on jouera une autre fois !");}
    }

    public String toString(Personnage perso, Menu menu) {
        return "Ton personnage s'appelle" + menu.personnageScannerName + "votre type est " + perso.getPersonnageType(menu.personnageScannerType);
    }
}