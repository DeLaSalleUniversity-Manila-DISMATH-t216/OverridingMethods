package ph.edu.dlsu.Olive;

public class Olive {

    public static final long BLACK = 0x000000;
    public static final long GREEN = 0x00FF00;

    public String name = "KALAMATA";
    public String flavor = "Grassy";
    public long color = Olive.BLACK;
    private int oil = 3;


    public Olive() {
        System.out.print("Constructor of " + this.name);
    }

    public Olive(int oil){
        this.oil = oil;
    }

    public int crush(){
        System.out.println("crush from superclass");
        return oil;
    }


}

