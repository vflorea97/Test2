package ro.mycode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenTest {

    @Test
    void afisare() {

        Punct punct = new Punct(3,7);
        Linie linie = new Linie(new Punct(5,5), new Punct(10,10));
        Cerc cerc = new Cerc(new Punct(5,5), new Linie(new Punct(3,3), new Punct(7,7)));
        Dreptunghi dreptunghi = new Dreptunghi(new Linie(punct,punct),new Linie(punct,punct));
//        dreptunghi.afisare();

        Desen desen = new Desen();
        desen.addFigura(cerc);
        desen.addFigura(linie);

        desen.afisare();
    }

    @Test
    void translatar() {

        Punct punct = new Punct(3,7);
        Linie linie = new Linie(new Punct(5,5), new Punct(10,10));
        Cerc cerc = new Cerc(new Punct(5,5), new Linie(new Punct(3,3), new Punct(7,7)));
        Dreptunghi dreptunghi = new Dreptunghi(new Linie(new Punct(3,3), new Punct(5,5)),new Linie(new Punct(3,10), new Punct(5,10)));


        dreptunghi.translatare(4);

        dreptunghi.afisare();
    }

    @Test
    void duplicare() {

        Punct punct = new Punct(3,7);
        Linie linie = new Linie(new Punct(5,5), new Punct(10,10));
        Cerc cerc = new Cerc(new Punct(5,5), new Linie(new Punct(3,3), new Punct(7,7)));
        Dreptunghi dreptunghi = new Dreptunghi(new Linie(new Punct(3,3), new Punct(5,5)),new Linie(new Punct(3,10), new Punct(5,10)));

        Figura punct1 = punct.duplicare();
        Figura linie1 = linie.duplicare();
        Figura cerc1 = cerc.duplicare();
        Figura dreptunghi1 = dreptunghi.duplicare();

        dreptunghi1.afisare();
    }
}