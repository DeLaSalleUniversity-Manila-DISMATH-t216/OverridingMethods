package ph.edu.dlsu.Olive;


public class Kalamata extends Olive {

    public Kalamata() {
        super(2);
        this.name = "Ligurian";
        this.flavor = "Yummy";
        this.color = Olive.GREEN;
    }

    @Override
    public int crush() {

        System.out.println("crush from subclass");
        return super.crush();
    }
}
