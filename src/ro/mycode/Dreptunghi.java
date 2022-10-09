package ro.mycode;

public class Dreptunghi implements Figura{

    private Linie linie1;
    private Linie linie2;

    public Dreptunghi(Linie linie1, Linie linie2) {
        this.linie1 = linie1;
        this.linie2 = linie2;
    }

    @Override
    public String toString(){
        String text = "Dreptunghi: \n";
        text += this.linie1.toString() + "\n";
        text += this.linie2.toString() + "\n";
        return text;
    }

    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public void translatare(int dim) {
        this.linie1.translatare(dim);
        this.linie2.translatare(dim);
    }

    @Override
    public Figura duplicare() {
        Figura dreptunghi = new Dreptunghi(linie1,linie2);
        return dreptunghi;
    }

    public Linie getLinie1() {
        return linie1;
    }

    public void setLinie1(Linie linie1) {
        this.linie1 = linie1;
    }

    public Linie getLinie2() {
        return linie2;
    }

    public void setLinie2(Linie linie2) {
        this.linie2 = linie2;
    }
}
