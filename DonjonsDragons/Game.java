package DonjonsDragons;
import java.util.ArrayList;

import DonjonsDragons.Persos.PersonnageHorsPlateauException;

import java.lang.Math;
import java.util.Scanner;

public class Game {
    /**
     * contiendra la logique interne du jeu (joueurs, avancement)
     */
    public ArrayList<Integer> plateau = new ArrayList<Integer>();
    private int die;

    private int dieResult;
    private int personnagePosition;
    Scanner scannerGame = new Scanner(System.in);

    public Game() throws PersonnageHorsPlateauException {
        this.die = 6;
        this.personnagePosition = 0;

        try {
            while(getPersonnagePosition()<64) {this.PersonnageMove();}}

        catch (PersonnageHorsPlateauException e) {
            e.printStackTrace();
            personnagePosition = 64;
            System.out.println("vous avez dépassé la case " + getPersonnagePosition());}

        finally{
            personnagePosition = 64;
            System.out.println("Vous avez terminé à la case " + getPersonnagePosition() + ", c'est gagné ! Appuyez sur 'o' !");
        }

        while(scannerGame.nextLine().equals("o")) {
            System.out.println("Voulez-vous rejouer ?");
            this.restart();
        }
    }

    public int getDie() {
        return this.dieResult = (int) (Math.random() * die + 1);

    }

    public int PersonnageMove() throws PersonnageHorsPlateauException {
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
    /** Méthode pour rejouer*/
    public void restart() throws PersonnageHorsPlateauException {
        System.out.println("Voulez-vous rejouer une partie (o/n)?");
        String restartChoice = scannerGame.nextLine();
        if (restartChoice.equals("o")) {
            personnagePosition = 0;
            while(getPersonnagePosition()<64) {this.PersonnageMove();}
        } else {
            System.out.println("Vous avez choisi de ne plus jouer.");
        }

    }
        }