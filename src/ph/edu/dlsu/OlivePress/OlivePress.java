package ph.edu.dlsu.OlivePress;

import ph.edu.dlsu.Olive.Olive;

import java.util.ArrayList;

public class OlivePress {

    public int getTotalOil() {
        return totalOil;
    }

    private void setTotalOil(int totalOil) {
        this.totalOil += totalOil;
    }

    private int totalOil = 0;

    public OlivePress(){
    }

    public void getOil(ArrayList<Olive> olives){

        int oil = 0;

        for (Olive olive : olives){
            oil += olive.crush();
        }

        setTotalOil(oil);

    }
}
