package DonjonsDragons.Equipements;

import DonjonsDragons.Game.ICase;

public abstract class EquipementOffensif extends Equipements implements ICase {

    private String sort;
    private int attackLevel;
    private String name;

//    public EquipementOffensif () {
//        this.arme = "épée"
//
//    }

    public String getSort() {
        return sort;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract String toString();


}
