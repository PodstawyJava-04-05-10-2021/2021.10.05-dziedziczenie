package com.comarch.final2;

import com.comarch.dziedziczenie.Car;

public class App {
    public static void main(String[] args) {
        final int a = 5;

        final Car c = new Car();

        c.brand = "Asdfgsdfg";

        System.out.println(c.brand);

        c.brand = "uxzytcviuyzxtcivy";

        System.out.println(c.brand);
    }
}
