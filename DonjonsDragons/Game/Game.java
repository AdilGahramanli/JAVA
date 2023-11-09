package DonjonsDragons.Game;
import java.util.ArrayList;
import DonjonsDragons.Equipements.*;
import DonjonsDragons.Persos.*;
import org.w3c.dom.ls.LSOutput;

import java.lang.Math;
import java.util.Scanner;

/** La classe game est la plus dense, la logique du jeu y est concentrée */
public class Game extends Menu {
    /**
     *
     * contiendra la logique interne du jeu (joueurs, avancement)
     */

    /**   */
    private int die;
    private int personnagePosition;
    public Scanner scannerGame = new Scanner(System.in);
    ArrayList<ICase> plateau = new ArrayList<ICase>();//le plateau de type ICase
    public Personnage personnageChoisi;
    private String mOrGChoice;

    public ArrayList <ICase> plateau2;


    /* /////////////////////////////////Constructeur //////////////////////////////////////////////////////////// */
    public Game() throws PersonnageHorsPlateauException {

        this.die = 6;

        this.personnagePosition = 0;

        personnageChoisi = null;

        personnageChoisi = new Guerrier(getPersonnageScannerName());
//        System.out.println(personnageChoisi.getClass()); //pour afficher les classes des objets.

        Plateau plateauTEST = new Plateau();

        plateau2 = new ArrayList<ICase>();

        plateauTEST.arrayCreation(plateau2);

        System.out.println("Creation du premier tableau (original)" + plateau2);
        System.out.println("********************");

        /** @param des paramètres un peu compliqués mais utiles. PlateauTest est une instance de Plateau pour qu'on puisse faire appel
         *                     aux méthodes de Plateau mais les autres sont des ArrayLists
         *                     pour nous faciliter l'appel aux méthodes comme set, get, remove...*/
        plateauTEST.modifyPlateauCases(plateau2, plateau2, plateauTEST);

        System.out.println("modification plateau : changement aléatoire des cases " + plateau2);

        plateauTEST.elementCreationArrayList(plateau2, 1, new Dragon());

        System.out.println("Modification : insertion de dragon en index 1" + plateau2);

        System.out.println("on a à l'index 1 un " + plateau2.get(1));

        /** @see Plateau a une méthode permettant de rechercher dans un ArrayList */
        plateauTEST.searchingElementArrayList(plateau2, "Dragon" );
        System.out.println("***************************");

        System.out.println("Choisissez un type 'm' ou 'g'");

        mOrGChoice = scannerGame.nextLine();

        personnageChoisi = personnageChoisirType(mOrGChoice);

        personnageChoisi.toString();

        System.out.println(personnageChoisi);


        /** Jeu, déplacement personnage*////////////////////////////////////////////////////////////////

            while (getPersonnagePosition() < 64 && personnageChoisi.getPersonnageLife() > 0)  {

                try {
                    int dieResult = getDie();
                    lancer_et_avancer(dieResult);
                    System.out.println("Résultat lancer de dés = " + dieResult);
                    plateauTEST.interact(personnageChoisi, personnagePosition, plateau2);
                    System.out.println(personnagePosition);
//                    throw new PersonnageHorsPlateauException();

                }

                catch(PersonnageHorsPlateauException exception )  {
//                setPersonnagePosition(64);

//                    exception.exceptionGestion(personnagePosition, 64);
                    exceptionGestion(personnagePosition, 64);
                    System.out.println("Le personnage se trouve à la case " + personnagePosition);
                }




                System.out.println("Niveau de vie : " + personnageChoisi.getPersonnageLife()
                        + " Niveau de force : " + personnageChoisi.getPersonnageForce());

//
//                System.out.println("personnage Position est " + getPersonnagePosition());
            }

             endGame(personnageChoisi);
        }

    public void endGame(Personnage personnageChoisi){
//        try {
            if (personnageChoisi.getPersonnageLife() <= 0) {

                System.out.println("Vous êtes mort, ce qui vous empêche malheureusement de gagner la partie");

            }
            else {

//                throw new PersonnageHorsPlateauException();
//                exceptionGestion(personnagePosition, 64);
                System.out.println("le personnage est revenu à la case " + personnagePosition);
                System.out.println("Vous avez gagné");
            }
//        }
//        catch(PersonnageHorsPlateauException exception2) {
////            exception2.exceptionGestion(personnagePosition, 64);
//            exception2.getMessage();
//            exceptionGestion(personnagePosition, 64);
//            System.out.println("le personnage est revenu à la case " + personnagePosition);
//            System.out.println("Vous avez gagné");
//
//        }
    }

//

    public int getDie() {
        return (int) (Math.random() * die + 1);

    }

    /** @return la position du personnage (int).*/
    public int personnageMove(Plateau plateau) throws PersonnageHorsPlateauException {
        if (this.getPersonnagePosition() < 64) {

            this.personnagePosition = this.personnagePosition + getDie();
            System.out.println(this.personnagePosition);
            plateau.interact(personnageChoisi , getPersonnagePosition(), plateau2);

            return this.personnagePosition;

        } else if (this.personnagePosition == 64) {

//            System.out.println("Vous avez gagné la partie.");
            return this.personnagePosition;

        } else {

            throw new PersonnageHorsPlateauException();

        } /*si >64 alors on traite l'exception*/

    }


    public void personnageChoice(Personnage gamer) {
        System.out.println("Vous devez choisir entre magicien ('m') ou guerrier ('g')");
        String joueurChoice = scannerGame.nextLine();
        if (joueurChoice.equals("m")) {
            gamer = new Magicien(getPersonnageScannerName());
            System.out.println("le joueur se nommera " + gamer.getPersonnageName());
            System.out.println("***********************");

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
    public Scanner getScanner() {
        return scannerGame;
    }

    /** @param choiceMorG est  un String car on va utiliser le résultat du scanner pour en faire une condition
     *             qui va décider de quel type de personnage on instancie.
     * @return le personnage choisi, donc un objet.
     * @see Personnage nous retournons une valeur de type Personnage car le personnage choisi est une instance
     * de la clase Personnage*/
    public Personnage personnageChoisirType(String choiceMorG) {

        if(choiceMorG.equals("m")) {personnageChoisi = new Magicien(getPersonnageScannerName());}

        else { personnageChoisi = new Guerrier(getPersonnageScannerName());}
        return personnageChoisi; /** @return Le personnage choisi selon le type indiqué par le joueur */
    }
    public void lancer_et_avancer (int lancerDes) throws PersonnageHorsPlateauException {
        personnagePosition = personnagePosition + lancerDes;
        if(personnagePosition>= plateau.size()){
            throw new PersonnageHorsPlateauException();
        }

    }

    public int getPersonnagePosition() {
        return this.personnagePosition;
    }

    public void setPersonnagePosition(int personnagePosition) {
        this.personnagePosition = personnagePosition;
    }

    public void exceptionGestion (int position, int positionVoulue) {

        position = positionVoulue;

    }


    /**
     * Méthode pour rejouer
     */
//    public void restart() throws PersonnageHorsPlateauException {
//        System.out.println("Voulez-vous rejouer une partie (o/n)?");
//        String restartChoice = scannerGame.nextLine();
//        if (restartChoice.equals("o")) {
//            personnagePosition = 0;
//            while (getPersonnagePosition() < 64) {
//                this.personnageMove(plateau);
//            }
//        } else {
//            System.out.println("Vous avez choisi de ne plus jouer.");
//        }

//    }

}