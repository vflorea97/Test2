package ro.mycode;

public class Linie implements Figura{

    private Punct punct1;
    private Punct punct2;

    public Linie(Punct punct1, Punct punct2) {
        this.punct1 = punct1;
        this.punct2 = punct2;
    }

    @Override
    public String toString(){
        String text = "Linie: \n";
        text += this.punct1.toString() + "\n";
        text += this.punct2.toString() + "\n";
        return text;
    }

    public Punct getPunct1() {
        return punct1;
    }

    public void setPunct1(Punct punct1) {
        this.punct1 = punct1;
    }

    public Punct getPunct2() {
        return punct2;
    }

    public void setPunct2(Punct punct2) {
        this.punct2 = punct2;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public void translatare(int dim) {
        this.punct1.translatare(dim);
        this.punct2.translatare(dim);

    }

    @Override
    public Figura duplicare() {
        Figura linie = new Linie(punct1,punct2);
        return linie;
    }
}
