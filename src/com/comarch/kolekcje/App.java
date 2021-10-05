package com.comarch.kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        System.out.println(lista);
        lista.add(5);
        System.out.println(lista);
        lista.add(8);
        System.out.println(lista);
        lista.add(10);
        System.out.println(lista);

        lista.remove(1);

        System.out.println(lista);

        System.out.println(lista.get(0));
    }
}
