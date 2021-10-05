package com.comarch.dziedziczenie;

public abstract class Calka {

    public double wyliczCalke() {
        pobierzDane();
        analiza();
        liczenie();
        zapis();
        return 0.0;
    }

    abstract void pobierzDane();

    void analiza() {

    }

    void liczenie() {

    }

    abstract void zapis();
}
