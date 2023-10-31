package DonjonsDragons.Game;

import DonjonsDragons.Equipements.*;
import DonjonsDragons.Persos.Dragon;
import DonjonsDragons.Persos.Goblin;
import DonjonsDragons.Persos.Personnage;
import DonjonsDragons.Persos.Sorcier;

import java.util.ArrayList;

public class Plateau implements ICase{

    public ArrayList plateau;
    public Plateau () {
        for (int i = 0; i < 64; i++) {
            plateau.add(i, "/Case " + (i + 1) + " " + (ICase) new EmptyCasePlateau() + " /");
//            plateau.set(i, "/ case " + i + "/");
        }
//        plateau.set(-1, (ICase) new Eclair());
        plateau.set(0, "/Case 1 " + (ICase) new Eclair()+ " /" );
        plateau.set(1, "/Case 2 " + (ICase) new Massue()+ " /" );
        plateau.set(2, "/Case 3 " + (ICase) new Goblin()+ " /" );
        plateau.set(3, "/Case 4 " + (ICase) new Eclair()+ " /" );
        plateau.set(4, "/Case 5 " + (ICase) new Massue()+ " /" );
        plateau.set(5, "/Case 6 " + (ICase) new Goblin()+ " /" );
        plateau.set(6, "/Case 7 " + (ICase) new PotionStandard()+ " /" );
        plateau.set(7, "/Case 8 " + (ICase) new Eclair() + " /");
        plateau.set(8, "/Case 9 " + (ICase) new Goblin()+ " /");
        plateau.set(9, "/Case 10 " + (ICase) new Sorcier()+ " /");
        plateau.set(10, "/Case 11 " + (ICase) new Massue()+ " /");

        plateau.set(11, "/Case 12 " + (ICase) new Goblin()+ " /");
        plateau.set(12, "/Case 13 " + (ICase) new PotionStandard()+ " /" );
        plateau.set(14, "/Case 15 " + (ICase) new Goblin()+ " /");
        plateau.set(16, "/Case 17 " + (ICase) new Eclair() + " /");
        plateau.set(17, "/Case 18 " + (ICase) new Goblin()+ " /");
        plateau.set(18, "/Case 19 " + (ICase) new Epee() + " /");
        plateau.set(19, "/Case 20 " + (ICase) new Sorcier()+ " /");
        plateau.set(20, "/Case 21 " + (ICase) new Goblin()+ " /");

        plateau.set(21, "/Case 22 " + (ICase) new Massue()+ " /");
        plateau.set(22, "/Case 23 " + (ICase) new Eclair() + " /");
        plateau.set(23, "/Case 24 " + (ICase) new Goblin()+ " /");
        plateau.set(24, "/Case 25 " + (ICase) new Sorcier()+ " /");
        plateau.set(26, "/Case 27 " + (ICase) new Goblin()+ " /");
        plateau.set(27, "/Case 28 " + (ICase) new GrandePotion() + " /");
        plateau.set(29, "/Case 30 " + (ICase) new Goblin()+ " /");

        plateau.set(30, "/Case 31 " + (ICase) new PotionStandard()+ " /" );
        plateau.set(31, "/Case 32 " + (ICase) new Sorcier()+ " /");
        plateau.set(32, "/Case 33 " + (ICase) new PotionStandard()+ " /" );
        plateau.set(34, "/Case 35 " + (ICase) new Sorcier()+ " /");
        plateau.set(35, "/Case 36 " + (ICase) new Sorcier()+ " /");
        plateau.set(36, "/Case 37 " + (ICase) new Sorcier()+ " /");
        plateau.set(37, "/Case 38 " + (ICase) new Sorcier()+ " /");
        plateau.set(38, "/Case 39 " + (ICase) new PotionStandard()+ " /" );
        plateau.set(39, "/Case 40 " + (ICase) new Sorcier()+ " /");

        plateau.set(40, "/Case 41 " + (ICase) new GrandePotion() + " /");
        plateau.set(41, "/Case 42 " + (ICase) new Epee() + " /");
        plateau.set(42, "/Case 43 " + (ICase) new PotionStandard()+ " /" );
        plateau.set(43, "/Case 44 " + (ICase) new Sorcier()+ " /");
        plateau.set(44, "/Case 45 " + (ICase) new Dragon()+ " /");
        plateau.set(46, "/Case 47 " + (ICase) new Sorcier()+ " /");
        plateau.set(47, "/Case 48 " + (ICase) new BouleDeFeu() + " /");
        plateau.set(48, "/Case 49 " + (ICase) new BouleDeFeu() + " /");

        plateau.set(51, "/Case 52 " + (ICase) new Dragon()+ " /");
        plateau.set(52, "/Case 53 " + (ICase) new Epee() + " /");
        plateau.set(55, "/Case 56 " + (ICase) new Dragon()+ " /");
        plateau.set(61, "/Case 62 " + (ICase) new Dragon()+ " /");

        plateau.set(63, "*/ case 64 finale /*");

        System.out.println(plateau);
    }

    @Override
    public int interact(Personnage personnage) {
        return 0;
    }
}
