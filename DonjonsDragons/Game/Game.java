package DonjonsDragons.Game;
import java.util.ArrayList;
import DonjonsDragons.Equipements.*;
import DonjonsDragons.Persos.*;
import java.lang.Math;
import java.util.Scanner;

/* ********************************************************************* */
public class Game extends Menu {
    /**
     * contiendra la logique interne du jeu (joueurs, avancement)
     */
    private int die;
    private int personnagePosition;
    private Scanner scannerGame = new Scanner(System.in);
    ArrayList<ICase> plateau = new ArrayList<ICase>();//le plateau de type ICase
    Personnage gamerChoice;


    /* /////////////////////////////////Constructeur //////////////////////////////////////////////////////////// */
    public Game() throws PersonnageHorsPlateauException {
        this.die = 6;
        this.personnagePosition = 0;
        System.out.println("Choisissez un type avec 'm' ou 'g'");
        String mOrGChoice = getScanner().nextLine(); //doute 1
        personnageNewChoice(mOrGChoice, gamerChoice);
        System.out.println(gamerChoice);



        personnageChoice(gamerChoice);
//        System.out.print(gamerChoice);

//        if (gamerChoice instanceof Guerrier) {
//            System.out.println("le personnage choisi est de type guerrier");

        plateauCreate(plateau);
//        personnageTypo(plateau); //place à la première case le personnage de type Magicien ou guerrier (non nécessaire ?)

//        System.out.println("le joueur a choisi" + gamerChoice);


        System.out.println(plateau);
        for (int i = 0; i < plateau.size(); i++) {
            System.out.println(plateau.get(i));
        }
        System.out.println("boucle for pour vérifier la classe d'un objet");
        for (int i = 0; i < plateau.size(); i++) {
//            Object objet = findActualCase(plateau, getPersonnagePosition());


            if (plateau.get(i) instanceof Massue) {
                System.out.println("cet objet est de type massue");
            }
        }


        try {
            while (getPersonnagePosition() < 64) {
                this.personnageMove();
                System.out.println(findActualCase(plateau, getPersonnagePosition()));
                findActualCase(plateau, getPersonnagePosition()).toString();
//                Object objet = findActualCase(plateau, getPersonnagePosition());
                if (findActualCase(plateau, getPersonnagePosition()) instanceof Goblin) {
                    System.out.println("ct obejt est de type Goblin");
                }

//                if ( findActualCase(plateau, getPersonnagePosition()) instanceof Goblin) {
//                    System.out.println("cet objet est de type éclair, massue ou goblin");
//                } else {
//                    System.out.println("ça marche pas (surtout sans chaussures)");
//                }

                System.out.println("personnage Position est " + getPersonnagePosition());
            }
        } catch (PersonnageHorsPlateauException e) {
            e.printStackTrace();

            personnagePosition = 64;
            System.out.println("vous avez dépassé la case " + getPersonnagePosition());
        } finally {
            personnagePosition = 64;
            System.out.println("Vous avez terminé à la case " + getPersonnagePosition() + ", c'est gagné ! Appuyez sur 'o' !");
        }

        while (scannerGame.nextLine().equals("o")) {
            System.out.println("Voulez-vous rejouer ?");
            this.restart();
        }
    }


    public int getDie() {
        return (int) (Math.random() * die + 1);

    }

    public int personnageMove() throws PersonnageHorsPlateauException {
        if (this.getPersonnagePosition() < 64) {

            this.personnagePosition = this.personnagePosition + getDie();
            System.out.println(this.personnagePosition);
            return this.personnagePosition;

        } else if (this.personnagePosition == 64) {

            System.out.println("Vous avez gagné la partie.");

        } else {

            throw new PersonnageHorsPlateauException();

        } /*si >64 alors on traite l'exception*/

        return personnagePosition;
    }


    public void personnageChoice(Personnage gamer) {
        System.out.println("Vous devez choisir entre magicien ('m') ou guerrier ('g')");
        String joueurChoice = scannerGame.nextLine();
        if (joueurChoice.equals("m")) {
            gamer = new Magicien(getPersonnageScannerName());
            System.out.println("le joueur se nommera " + gamer.getPersonnageName());

//            gamerChoice.toString();
        } else if (joueurChoice.equals("g")) {
            gamer = new Guerrier(getPersonnageScannerName());
            System.out.println("le joueur se nommera " + gamer.getPersonnageName());
            gamer.toString();
        } else {
            System.out.println("vous savez pas taper au clavier, recommencez (c'est avec des minuscules pour info)");
            personnageChoice(gamer);
        }

    }


    public int getPersonnagePosition() {
        return this.personnagePosition;
    }

    /**
     * Méthode pour rejouer
     */
    public void restart() throws PersonnageHorsPlateauException {
        System.out.println("Voulez-vous rejouer une partie (o/n)?");
        String restartChoice = scannerGame.nextLine();
        if (restartChoice.equals("o")) {
            personnagePosition = 0;
            while (getPersonnagePosition() < 64) {
                this.personnageMove();
            }
        } else {
            System.out.println("Vous avez choisi de ne plus jouer.");
        }

    }

    ////////////////Création du plateau ///////////////////////////////
    public void plateauCreate(ArrayList plateau) {

        for (int i = 0; i < 64; i++) {
            plateau.add(i, "/Case " + (i + 1) + " " + (ICase) new EmptyCasePlateau() + " /");
//            plateau.set(i, "/ case " + i + "/");
        }
//        plateau.set(-1, (ICase) new Eclair());
        plateau.set(0, "/Case 1 " + (ICase) new Eclair() + " /");
        plateau.set(1, "/Case 2 " + (ICase) new Massue() + " /");
        plateau.set(2, "/Case 3 " + (ICase) new Goblin() + " /");
        plateau.set(3, "/Case 4 " + (ICase) new Eclair() + " /");
        plateau.set(4, "/Case 5 " + (ICase) new Massue() + " /");
        plateau.set(5, "/Case 6 " + (ICase) new Goblin() + " /");
        plateau.set(6, "/Case 7 " + (ICase) new PotionStandard() + " /");
        plateau.set(7, "/Case 8 " + (ICase) new Eclair() + " /");
        plateau.set(8, "/Case 9 " + (ICase) new Goblin() + " /");
        plateau.set(9, "/Case 10 " + (ICase) new Sorcier() + " /");
        plateau.set(10, "/Case 11 " + (ICase) new Massue() + " /");

        plateau.set(11, "/Case 12 " + (ICase) new Goblin() + " /");
        plateau.set(12, "/Case 13 " + (ICase) new PotionStandard() + " /");
        plateau.set(14, "/Case 15 " + (ICase) new Goblin() + " /");
        plateau.set(16, "/Case 17 " + (ICase) new Eclair() + " /");
        plateau.set(17, "/Case 18 " + (ICase) new Goblin() + " /");
        plateau.set(18, "/Case 19 " + (ICase) new Epee() + " /");
        plateau.set(19, "/Case 20 " + (ICase) new Sorcier() + " /");
        plateau.set(20, "/Case 21 " + (ICase) new Goblin() + " /");

        plateau.set(21, "/Case 22 " + (ICase) new Massue() + " /");
        plateau.set(22, "/Case 23 " + (ICase) new Eclair() + " /");
        plateau.set(23, "/Case 24 " + (ICase) new Goblin() + " /");
        plateau.set(24, "/Case 25 " + (ICase) new Sorcier() + " /");
        plateau.set(26, "/Case 27 " + (ICase) new Goblin() + " /");
        plateau.set(27, "/Case 28 " + (ICase) new GrandePotion() + " /");
        plateau.set(29, "/Case 30 " + (ICase) new Goblin() + " /");

        plateau.set(30, "/Case 31 " + (ICase) new PotionStandard() + " /");
        plateau.set(31, "/Case 32 " + (ICase) new Sorcier() + " /");
        plateau.set(32, "/Case 33 " + (ICase) new PotionStandard() + " /");
        plateau.set(34, "/Case 35 " + (ICase) new Sorcier() + " /");
        plateau.set(35, "/Case 36 " + (ICase) new Sorcier() + " /");
        plateau.set(36, "/Case 37 " + (ICase) new Sorcier() + " /");
        plateau.set(37, "/Case 38 " + (ICase) new Sorcier() + " /");
        plateau.set(38, "/Case 39 " + (ICase) new PotionStandard() + " /");
        plateau.set(39, "/Case 40 " + (ICase) new Sorcier() + " /");

        plateau.set(40, "/Case 41 " + (ICase) new GrandePotion() + " /");
        plateau.set(41, "/Case 42 " + (ICase) new Epee() + " /");
        plateau.set(42, "/Case 43 " + (ICase) new PotionStandard() + " /");
        plateau.set(43, "/Case 44 " + (ICase) new Sorcier() + " /");
        plateau.set(44, "/Case 45 " + (ICase) new Dragon() + " /");
        plateau.set(46, "/Case 47 " + (ICase) new Sorcier() + " /");
        plateau.set(47, "/Case 48 " + (ICase) new BouleDeFeu() + " /");
        plateau.set(48, "/Case 49 " + (ICase) new BouleDeFeu() + " /");

        plateau.set(51, "/Case 52 " + (ICase) new Dragon() + " /");
        plateau.set(52, "/Case 53 " + (ICase) new Epee() + " /");
        plateau.set(55, "/Case 56 " + (ICase) new Dragon() + " /");
        plateau.set(61, "/Case 62 " + (ICase) new Dragon() + " /");

        plateau.set(63, "*/ case 64 finale /*");

    }

    public Object findActualCase(ArrayList plateau, int index) {

        return plateau.get(index);  //ici faire un -1 pour caler index et incrémentation)
//           }
//            catch (PersonnageHorsPlateauException e) {
//                System.out.println(e.getMessage());
//            }
//            finally {return plateau.get(index - 1);}
    }


//




//            ///    public void personnageTypo(ArrayList plateau) {
//        System.out.println("Vous devez choisir entre magicien ('m') ou guerrier ('g')");
//        String joueurChoice = scannerGame.nextLine();
//        if (joueurChoice.equals("m")) {
//            plateau.set(0, "/Case 0" + (ICase) new Magicien(getPersonnageScannerName()) + " /");
//        } else if (joueurChoice.equals("g")) {
//            plateau.set(0, (ICase) new Guerrier(getPersonnageScannerName()) + " /");
//        } else {
//            System.out.println("vous savez pas taper au clavier, recommencez (c'est avec des minuscules pour info)");
//            personnageTypo(plateau);
//        }
//    }
    /* NOT IMPLEMENTED FUNCTIONS */
//            public void interactBoard () { // interagir avec le plateau(bonus, combat...) transforme les attributs du perso

//            }

//            public void gameStatut () { //envoie un message selon si on joue, quitte, meurt...

//            }
    //Jouer = lancer dés, résultat obtenu -1 = index du tableau avec laquelle interagir.
    //Fonction lancer dés retourne donc l'index du tableau qui nous intéresse

    //Interaction = on récupère le retour du lancer de dés (on lancer le lancer de dés) et on...
    // ..........  ....... .............................. ...........................
    //.............................................................................

    public Scanner getScanner() {
        return scannerGame;
    }

    public void personnageNewChoice(String choiceMorG, Personnage personnage) {
        if (choiceMorG.equals("m")) {
            personnage = new Magicien(getPersonnageScannerName());
        } else {
            personnage = new Guerrier(getPersonnageScannerName());
        }
    }

}