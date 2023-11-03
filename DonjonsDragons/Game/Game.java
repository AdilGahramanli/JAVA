package DonjonsDragons.Game;
import java.util.ArrayList;
import DonjonsDragons.Equipements.*;
import DonjonsDragons.Persos.*;
import org.w3c.dom.ls.LSOutput;

import java.lang.Math;
import java.util.Scanner;

/* ********************************************************************* */
public class Game extends Menu {
    /**
     * contiendra la logique interne du jeu (joueurs, avancement)
     */
    private int die;
    private int personnagePosition;
    public Scanner scannerGame = new Scanner(System.in);
    ArrayList<ICase> plateau = new ArrayList<ICase>();//le plateau de type ICase
    public Personnage personnageChoisi;
    private String mOrGChoice;


    /* /////////////////////////////////Constructeur //////////////////////////////////////////////////////////// */
    public Game() throws PersonnageHorsPlateauException {

        this.die = 6;

        this.personnagePosition = 0;

        personnageChoisi = null;

        personnageChoisi = new Guerrier(getPersonnageScannerName());
        System.out.println(personnageChoisi.getClass());

        Plateau plateauTEST = new Plateau();

        System.out.println("Choisissez un type 'm' ou 'g'");

        mOrGChoice = scannerGame.nextLine();

        personnageChoisi = personnageChoisirType(mOrGChoice);

        personnageChoisi.toString();

        System.out.println(personnageChoisi);


        /** Jeu, déplacement personnage*/
//        try {
            while (getPersonnagePosition() < 64) {

//
                lancer_et_avancer(getDie());


                System.out.println(personnagePosition);

                plateauTEST.interact(personnageChoisi, personnagePosition);



//                plateauTEST.interact(personnageChoisi, getPersonnagePosition());

                System.out.println("Niveau de vie : " + personnageChoisi.getPersonnageLife() + " Niveau de force : " + personnageChoisi.getPersonnageForce());

//
                System.out.println("personnage Position est " + getPersonnagePosition());
            }
        }
//        catch (PersonnageHorsPlateauException e) {
//            personnagePosition = 64;
//            System.out.println("vous avez gagné");
//        }
//    }



//        public void setPersonnagePosition(int lancerDés) {
//            try {personnagePosition = personnagePosition + lancerDés;}
//            catch(PersonnageHorsPlateauException e) {
//                personnagePosition = 64;
//                System.out.println(personnagePosition);
//            }
//        }

    public int getDie() {
        return (int) (Math.random() * die + 1);

    }

    public int personnageMove(Plateau plateau) throws PersonnageHorsPlateauException {
        if (this.getPersonnagePosition() < 64) {

            this.personnagePosition = this.personnagePosition + getDie();
            System.out.println(this.personnagePosition);
            plateau.interact(personnageChoisi , getPersonnagePosition());

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

    public void lancer_et_avancer (int lancerDés){
        personnagePosition = personnagePosition + lancerDés;

    }

    public int getPersonnagePosition() {
        return this.personnagePosition;
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


    public Object findActualCase(ArrayList plateau, int index) {
        Object plateauIndex = null;
        if(index!=1) {
            plateauIndex = plateau.get(index-1);
//            return plateauIndex;
        }  //ici faire un -1 pour caler index et incrémentation)
//           }
//            catch (PersonnageHorsPlateauException e) {
//                System.out.println(e.getMessage());
//            }
//            finally {return plateau.get(index - 1);}
    return plateauIndex;}

    public ICase getActualCaseObject(int index) {
        return plateau.get(index);
    }






//
    public Scanner getScanner() {
        return scannerGame;
    }

    public Personnage personnageChoisirType(String choiceMorG) {

        if(choiceMorG.equals("m")) {personnageChoisi = new Magicien(getPersonnageScannerName());}

            else { personnageChoisi = new Guerrier(getPersonnageScannerName());}
    return personnageChoisi;
    }



}