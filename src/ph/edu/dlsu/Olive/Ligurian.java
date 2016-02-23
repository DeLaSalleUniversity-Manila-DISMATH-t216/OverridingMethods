package ph.edu.dlsu.Olive;

public class Ligurian extends Olive {

    public Ligurian() {
        super(1);
        this.name = "Kalamata";
        this.flavor = "Grassy";
        this.color = Olive.BLACK;


    }

    @Override
    public String toString() {
        return "Ligurian{" +
                "NAME" + this.name +
                "flavor = " + this.flavor +
                "}";
    }
}
