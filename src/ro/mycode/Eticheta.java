package ro.mycode;

public class Eticheta extends Dreptunghi{

    private String text;
    private Dreptunghi dreptunghi;

    public Eticheta(Dreptunghi dreptunghi, String text) {
        super(dreptunghi.getLinie1(), dreptunghi.getLinie2());
        this.dreptunghi = dreptunghi;
        this.text = text;
    }

    @Override
    public String toString(){
        String text = "Eticheta: " + "\n";
        text += super.toString();
        text += "Text: " + this.text + "\n";
        return text;
    }

    @Override
    public void afisare(){
        System.out.println(this);
    }

    @Override
    public void translatare(int dim){
        super.translatare(dim);
    }

    @Override
    public Figura duplicare(){
        Figura eticheta = new Eticheta(dreptunghi,text);
        return eticheta;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
