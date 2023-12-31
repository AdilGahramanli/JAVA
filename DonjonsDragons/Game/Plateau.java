package DonjonsDragons.Game;

import DonjonsDragons.Equipements.*;
import DonjonsDragons.Persos.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private ArrayList<ICase> plateau;

    Eclair eclairItem;

    public Plateau() {

//        plateau = new ArrayList<ICase>();
//
//        arrayCreation(plateau);
//
//        System.out.println("Premier plateau " + plateau);
//
////        modifyPlateauCases(plateau, plateau);
//
//        System.out.println("Plateau modifié " + plateau);


//        for (int i = 0; i < plateau.size(); i++) {
//
//            System.out.println(plateau.get(i).getClass());
//        }

//        System.out.println("c'était le nouveau plateau !");


    }

    public void arrayCreation(ArrayList plateau) {

        for (int i = 0; i < 64; i++) {
            plateau.add(i, new EmptyCasePlateau());
//            plateau.set(i, "/ case " + i + "/");
        }
//        plateau.set(-1, (ICase) new Eclair());
        plateau.set(0, new Eclair());
        plateau.set(1, new Massue());
        plateau.set(2, new Goblin());
        plateau.set(3, new Eclair());
        plateau.set(4, new Massue());
        plateau.set(5, new Goblin());
        plateau.set(6, new PotionStandard());
        plateau.set(7, new Eclair());
        plateau.set(8, new Goblin());
        plateau.set(9, new Sorcier());
        plateau.set(10, new Massue());

        plateau.set(11, new Goblin());
        plateau.set(12, new PotionStandard());
        plateau.set(14, new Goblin());
        plateau.set(16, new Eclair());
        plateau.set(17, new Goblin());
        plateau.set(18, new Epee());
        plateau.set(19, new Sorcier());
        plateau.set(20, new Goblin());

        plateau.set(21, new Massue());
        plateau.set(22, new Eclair());
        plateau.set(23, new Goblin());
        plateau.set(24, new Sorcier());
        plateau.set(26, new Goblin());
        plateau.set(27, new GrandePotion());
        plateau.set(29, new Goblin());

        plateau.set(30, new PotionStandard());
        plateau.set(31, new Sorcier());
        plateau.set(32, new PotionStandard());
        plateau.set(34, new Sorcier());
        plateau.set(35, new Sorcier());
        plateau.set(36, new Sorcier());
        plateau.set(37, new Sorcier());
        plateau.set(38, new PotionStandard());
        plateau.set(39, new Sorcier());

        plateau.set(40, new GrandePotion());
        plateau.set(41, new Epee());
        plateau.set(42, new PotionStandard());
        plateau.set(43, new Sorcier());
        plateau.set(44, new Dragon());
        plateau.set(46, new Sorcier());
        plateau.set(47, new BouleDeFeu());
        plateau.set(48, new BouleDeFeu());

        plateau.set(51, new Dragon());
        plateau.set(52, new Epee());
        plateau.set(55, new Dragon());
        plateau.set(61, new Dragon());

        plateau.set(63, new EmptyCasePlateau());
    }


    public void getPlateauObject(ArrayList plateau) {
        for (int i = 0; i < plateau.size(); i++) {
            System.out.println(plateau.get(i).getClass());
        }

    }

    public void getPlateauGoblin(ArrayList plateau) {
        for (int i = 0; i < plateau.size(); i++) {
            System.out.println(plateau.get(i) instanceof Goblin);
        }
    }

    public boolean checkGoblinCase(Object goblin) {
//        return goblin instanceof Goblin;
        if (goblin instanceof Goblin) {
            return true;
        } else {
            return false;
        }
    }

    public int interact(Personnage personnage, int index, ArrayList <ICase> plateau) throws PersonnageHorsPlateauException {
        if (index >= plateau.size()) {throw new PersonnageHorsPlateauException();}
        return plateau.get(index).interact(personnage);
    }


    public void modifyPlateauCases(ArrayList <ICase> plateau1, ArrayList plateau2, Plateau plateau3) {

        for (int i = 0; i < plateau1.size(); i++) {

//            plateau2.set((int) (Math.random() * 64), plateau1.get(i));
            plateau3.elementCreationArrayList(plateau2, hazardNumberforCases(64), plateau1.get(i) );

        }

    }



    public int hazardNumberforCases(int numberRange) {
        return (int) (Math.random() * numberRange);
    }
    public void elementCreationArrayList (ArrayList <ICase> plateau, int index, ICase element) {
        plateau.set(index, element);
    }
    public void removingElementArrayList (ArrayList <ICase> plateau, int index) {
        plateau.remove( index );

    }

    public void searchingElementArrayList (ArrayList <ICase> plateau, String classSearched) {
        for (ICase element : plateau) {
            if (element.toString().contains(classSearched)) {
                System.out.println(element);
            }
        }
    }
}
