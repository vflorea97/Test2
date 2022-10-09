package ro.mycode;

public class Punct implements Figura{

    private int x;
    private int y;

    public Punct (int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        String text = "Punct: \n";
        text += this.x + "\n";
        text += this.y + "\n";
        return text;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void afisare() {

        System.out.println(this.toString());

    }

    @Override
    public void translatare(int dim) {

       this.x+=dim ;
       this.y += dim;
    }

    @Override
    public Figura duplicare() {
        Figura punct = new Punct(this.x,this.y);
        return punct;
    }
}
