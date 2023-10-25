package DonjonsDragons.Game;
import java.util.ArrayList;

import DonjonsDragons.Equipements.Arme;
import DonjonsDragons.Equipements.Potion;
import DonjonsDragons.Persos.Guerrier;
import DonjonsDragons.Persos.Magicien;
import DonjonsDragons.Persos.PersonnageHorsPlateauException;
import java.lang.Math;
import java.util.Scanner;

public class Game implements ICase{
    /**
     * contiendra la logique interne du jeu (joueurs, avancement)
     */

    private int die;
    private int dieResult;
    private int personnagePosition;
    Scanner scannerGame = new Scanner(System.in);
    ArrayList<ICase> plateau = new ArrayList<ICase>() ;



    public Game() throws PersonnageHorsPlateauException {
//        plateau.add(1,  new Guerrier());
//        System.out.println(plateau.get(1));

        plateau.set(1, new Guerrier());
        plateau.set(2, new Guerrier());

        this.die = 6;
        this.personnagePosition = 0;

        try {
            while(getPersonnagePosition()<64) {this.personnageMove();}}

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
    /** Méthode pour rejouer*/
    public void restart() throws PersonnageHorsPlateauException {
        System.out.println("Voulez-vous rejouer une partie (o/n)?");
        String restartChoice = scannerGame.nextLine();
        if (restartChoice.equals("o")) {
            personnagePosition = 0;
            while(getPersonnagePosition()<64) {this.personnageMove();}
        } else {
            System.out.println("Vous avez choisi de ne plus jouer.");
        }

    }

        public void plateauCreate () {
//
            plateau.add(1, (ICase) new Magicien());
            plateau.add(2, (ICase) new Arme());
            plateau.add(3, (ICase) new Potion());
//
        }


        }