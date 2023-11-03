package DonjonsDragons.Equipements;

public abstract class EquipementDefensif extends Equipements {
    private String bouclier = "Bouclier";
    private int defenseLevel;
    private String name;

    public EquipementDefensif(int defense_level) {
        this.defenseLevel = defense_level;
    }

    public String getBouclier(String bouclier) {
        return bouclier;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }
    public String getName() {
        return name;
    }


}
