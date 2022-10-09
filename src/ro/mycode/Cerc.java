package ro.mycode;

public class Cerc implements Figura{

    private Punct punct1;
    private Linie linie1;

    public Cerc(Punct punct1, Linie linie1) {
        this.punct1 = punct1;
        this.linie1 = linie1;
    }

    @Override
    public String toString(){
        String text = "Cerc: \n";
        text += this.punct1.toString() + "\n";
        text += this.linie1.toString() + "\n";
        return text;
    }

    public Punct getPunct1() {
        return punct1;
    }

    public void setPunct1(Punct punct1) {
        this.punct1 = punct1;
    }

    public Linie getLinie1() {
        return linie1;
    }

    public void setLinie1(Linie linie1) {
        this.linie1 = linie1;
    }

    @Override
    public void afisare() {
        System.out.println(this);

    }

    @Override
    public void translatare(int dim) {
        this.punct1.translatare(dim);
        this.linie1.translatare(dim);

    }

    @Override
    public Figura duplicare() {
        Figura cerc = new Cerc(punct1,linie1);
        return cerc;
    }
}
