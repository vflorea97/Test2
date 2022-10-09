package ro.mycode;

import java.util.Scanner;

public class ViewDesen {

    private Desen desen;
    private Scanner scanner;

    public ViewDesen(){

        desen = new Desen();
        scanner = new Scanner(System.in);
    }

    public void meniu(){
        System.out.println("Apasa 1 pentru a creea un punct");
        System.out.println("Apasa 2 pentru a creea o linie");
        System.out.println("Apasa 3 pentru a creea un cerc");
        System.out.println("Apasa 4 pentru a creea un dreptunghi");
        System.out.println("Apasa 5 pentru a creea o eticheta");
        System.out.println("Apasa 6 pentru a translata o figura");
        System.out.println("Apasa 7 pentru a duplica o figura ");
        System.out.println("APasa 8 pentru a afisa o figura");
    }

    public void run(){
        boolean run = true;
        meniu();
        while (run){
            int buton = Integer.parseInt(scanner.nextLine());
            switch (buton){
                case 1:
                    punct();
                    System.out.println();
                    meniu();
                    break;
                case 2:
                    linie();
                    System.out.println();
                    meniu();
                    break;
                case 3:
                    cerc();
                    System.out.println();
                    meniu();
                    break;
                case 4:
                    dreptunghi();
                    System.out.println();
                    meniu();
                    break;
                case 5:
                    eticheta();
                    System.out.println();
                    meniu();
                    break;
                case 8:
                    desen.afisare();
                    break;
            }
        }
    }

    public Figura punct(){
        System.out.println("Introdu coordonata x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Introdu coordonata y: ");
        int y = Integer.parseInt(scanner.nextLine());
        Figura punct = new Punct(x,y);
        desen.addFigura(punct);
        return punct;
    }

    public Figura linie(){
        System.out.println("Introdu coordonatele x si y pentru punctul 1:");
        Punct punct1 = (Punct)punct();
        System.out.println("Punctul 2: ");
        Punct punct2 = (Punct)punct();
        Figura linie = new Linie(punct1,punct2);
        desen.addFigura(linie);
        return linie;

    }

    public Figura cerc(){
        System.out.println("Introdu coordonatele x si y pentru punc: ");
        Punct punct = (Punct)punct();
        System.out.println("Linie: ");
        Linie linie = (Linie)linie();
        Figura cerc = new Cerc(punct,linie);
        desen.addFigura(cerc);
        return linie;
    }

    public Figura dreptunghi(){
        System.out.println("Introdu coordonatele liniei 1: ");
        Linie linie1 = (Linie)linie();
        System.out.println("Linia 2: ");
        Linie linie2 = (Linie)linie();
        Figura dreptunghi = new Dreptunghi(linie1,linie2);
        desen.addFigura(dreptunghi);
        return dreptunghi;
    }

//    public Dreptunghi eticheta(){
//        System.out.println("Introdu coordonatele dreptunghiului: ");
//        Dreptunghi dreptunghi = (Dreptunghi)dreptunghi();
//        System.out.println("Introdu textul din eticheta: ");
//        String text = scanner.nextLine();
//        Dreptunghi eticheta = new Eticheta(dreptunghi,text);
//        desen.addFigura(eticheta);
//        return eticheta;
//    }

    public void translatare (){
        System.out.println("");
    }
}
