package com.comarch.static2;

public class App {
    public static void main(String[] args) {
        int wynik = Kalkulator.dodaj(3,6);
        System.out.println(wynik);

        Kalkulator.a = 6;

        Kalkulator k1 = new Kalkulator();
        Kalkulator k2 = new Kalkulator();

        System.out.println(k1.a);
        System.out.println(k2.a);
    }
}
