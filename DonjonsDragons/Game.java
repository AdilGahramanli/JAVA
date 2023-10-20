import java.lang.Math;
import java.util.Scanner;

public class Game {
    /**
     * contiendra la logique interne du jeu (joueurs, avancement)
     */
    public int[] plateau = new int[63];
    private int die = 6;

    private int dieResult;
    private int personnagePosition;
    Scanner scannerGame = new Scanner(System.in);



    public int getDie() {
        return this.dieResult = (int) (Math.random() * die + 1);

    }

    public int PersonnageMove() {

        if (this.personnagePosition < 64) {
            this.personnagePosition = this.personnagePosition + getDie();
            System.out.println(this.personnagePosition);
            return this.personnagePosition;
        } else {

            System.out.println("Fin du jeu vous avez dépassé la case d'arrivée");
            return this.personnagePosition;
        }

    }
        public int getPersonnagePosition () {
            return this.personnagePosition;
        }

        public String gameOrNot() {
            System.out.println("Vous voulez 'recommencer' ou 'quitter' ?");
            String choiceGame = scannerGame.nextLine();
            if( choiceGame.equals("recommencer")) {
                return choiceGame;
            }
            else {
                return "quitter";
            }
        }




}
