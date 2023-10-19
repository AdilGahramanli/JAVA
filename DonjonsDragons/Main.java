import java.util.Scanner;

public class Main {
    /**structurer correctement le déroulement
du jeu et les messages pour l’utilisateur en utilisant des fonctions.*/

        public static void main(String[] args) {
        Menu menu = new Menu();
            String personnageScannerName;
            String personnageScannerType;
            Personnage personnage = new Personnage ("name", "type");




        //Personnage scanner name
            System.out.println("Bienvenue dans le jeu, veuillez choisir un nom pour votre avatar");
        Scanner scanner_Name = new Scanner(System.in);
        personnageScannerName = personnage.getPersonnageName(scanner_Name.nextLine());
        personnageScannerName = personnage.setName(personnageScannerName);
            System.out.println("votre personnage s'appelle " + personnage.setName(personnageScannerName));
        //Personnage Type scanner
            Scanner scanner_Type = new Scanner(System.in);
            personnageScannerType = scanner_Type.nextLine();
            if(personnageScannerType.equals("M")) {
                personnageScannerType = personnage.setPersonnageTypeMagicien();
            }
            else if (personnageScannerType.equals("W")) {
                personnageScannerType = personnage.setPersonnageTypeGuerrier();
            }
            System.out.println("Votre personnage est un " + personnageScannerType);
//            personnage.arme.name = "couteau à couper le beurre";
//            System.out.println(personnage.arme.name);







        }
}
