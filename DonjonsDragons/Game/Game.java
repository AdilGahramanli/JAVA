package DonjonsDragons.Game;
import java.util.ArrayList;

import DonjonsDragons.Equipements.*;
import DonjonsDragons.Persos.*;

import java.lang.Math;
import java.util.Scanner;
/* ********************************************************************* */
public class Game implements ICase, emptyCase {
    /**
     * contiendra la logique interne du jeu (joueurs, avancement)
     */
    private int die;
    private int dieResult;
    private int personnagePosition;
    Scanner scannerGame = new Scanner(System.in);
    ArrayList<ICase> plateau = new ArrayList<ICase>();//le plateau de type ICase
    emptyCase emptyCase;

    /* ******************* */
    public Game() throws PersonnageHorsPlateauException {
        plateauCreate(plateau);
        System.out.println(plateau);
        plateau.add(0, );

        this.die = 6;
        this.personnagePosition = 0;

        try {
            while (getPersonnagePosition() < 64) {
                this.personnageMove();
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
        return this.dieResult = (int) (Math.random() * die + 1);

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

    public void plateauCreate(ArrayList plateau) {

        for (int i = 0; i < 64; i++) {
            plateau.add(i, " Case " + (i + 1) + " " + (emptyCase) + " /");
//            plateau.set(i, "/ case " + i + "/");
        }

        plateau.set(0, (ICase) new Guerrier() + " /");
        plateau.set(4, "/Case 5 " + (ICase) new PotionStandard()+ " /" );
        plateau.set(6, "/Case 7 " + (ICase) new Épée()+ " /");
        plateau.set(8, "/Case 9 " + (ICase) new Goblin()+ " /");
        plateau.set(14, "/Case 15 " + (ICase) new Bouclier()+ " /");
        plateau.set(20, "/Case 21 " + (ICase) new Sorcier()+ " /");
        plateau.set(30, "/Case 31 " + (ICase) new Goblin()+ " /");
        plateau.set(34, "case 35 " + (ICase) new Bouclier()+ " /");
        plateau.set(60, "/Case 61 " + (ICase) new Dragon()+ " /");
        plateau.set(63, "*/ case 64 finale /*");

    }


        /* NOT IMPLEMENTED FUNCTIONS */
//            public void interactBoard () { // interagir avec le plateau(bonus, combat...) transforme les attributs du perso

//            }

//            public void gameStatut () { //envoie un message selon si on joue, quitte, meurt...

//            }

}