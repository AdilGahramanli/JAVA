public class Personnage {
    private String personnageName;
    private String personnageType;
    private int niveauDeVie;
    String choice;

//    private EquipementOffensif arme;
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


//        setStats();

    }

    //SETTERS et GETTERS
    public String getName(String name) {
        this.personnageName = name;
        return name;
    }

    public String setPersonnageName(String name) {
        return personnageName = name;
    }

    public void getNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }


    public String getPersonnageType(String choice) {
        if (choice.equals("M")) {
            personnageType = "Magician";
        }
        if (choice.equals("W")) {
            personnageType = "Warrior";
        }
        return personnageType;
    }

    public String toString (String name, String type){
        return "Votre personnage s'appelle " + getName(name) + " et votre type de personnage est " +
                getPersonnageType(type);
    }


}
