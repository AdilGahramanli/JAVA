public class Personnage {
    private String personnageName;
    private String personnageType;
    private int niveauDeVie;

    private EquipementOffensif arme;
//        private arme() {
//            this.arme = "épée";
//        }

    public Personnage() {

    }
    public Personnage(String personnage_Name) {
        personnageName = personnage_Name;
    }
    public Personnage(String personnage_Name, String personnage_Type) {
        personnageName = personnage_Name;
        personnageType = personnage_Type;

    }
//SETTERS et GETTERS
    public String setName(String name) {
        this.personnageName = name;
        return name;
    }
    public String getPersonnageName(String name) {
        return personnageName = name;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public String setPersonnageTypeMagicien() {
    return personnageType = "magicien";
    }
    public String setPersonnageTypeGuerrier() {
        return personnageType = "guerrier";
    }
}
