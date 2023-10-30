package DonjonsDragons.Game;

public class EmptyCasePlateau implements ICase{
    public EmptyCasePlateau() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Case vide";
    }

    @Override
    public int interact () {

        return 1;
    }
}
