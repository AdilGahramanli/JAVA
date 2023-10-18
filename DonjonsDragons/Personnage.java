public class Personnage {
    private String personnageName;
    private String personnageType;
    private int niveauDeVie;
    private String name;
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
    public void setName(String name) {
        this.personnageName = name;
    }

    public String getPersonnageName() {
        return personnageName;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public void setPersonnageType(String personnageType) {
        this.personnageType = personnageType;
    }
}
