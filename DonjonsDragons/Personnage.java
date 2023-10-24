package DonjonsDragons;

public abstract class Personnage {
    protected String personnageName;


    public Personnage() {

    }

    public Personnage(String personnage_Name) {
        personnageName = personnage_Name;
    }


    //SETTERS et GETTERS
    public String getName(String name) {
        return this.personnageName = name;

    }

    public String toString(String name, String type) {
        return "Votre personnage s'appelle " + getName(name);
    }

    public String getPersonnageName() {
        return personnageName;
    }

    public void setPersonnageName(String scannerName) {
        personnageName = scannerName;
    }

}
//magicien a 3 à 6, guerier de 5 à 10;