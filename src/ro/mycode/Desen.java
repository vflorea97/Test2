package ro.mycode;

import java.util.ArrayList;

public class Desen implements Figura {

    private ArrayList<Figura> figuri;

    public Desen (){
        figuri = new ArrayList<>();
    }

    public void addFigura(Figura figura){
        this.figuri.add(figura);
    }
    @Override
    public void afisare(){
        for (int i = 0; i < figuri.size(); i++){
            System.out.println(figuri.get(i));
        }
    }

    @Override
    public void translatare(int numar) {

    }

    @Override
    public Figura duplicare() {
        return null;
    }

}
