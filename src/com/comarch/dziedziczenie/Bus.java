package com.comarch.dziedziczenie;

public class Bus extends Vehicle {
    int passengers;

    @Override
    void jedz() {
        System.out.println("Jadę powoli !!");
    }
}
