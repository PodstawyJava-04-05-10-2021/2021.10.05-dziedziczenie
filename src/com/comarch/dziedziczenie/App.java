package com.comarch.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";

        car.jedz();

        Bus bus = new Bus();
        bus.brand = "Solaris";
        bus.passengers = 50;

        bus.jedz();

        Vehicle vehicle = new Vehicle();

        vehicle.jedz();

        Vehicle v = new Car();
        Vehicle v2 = new Bus();

        Vehicle[] tab = new Vehicle[10];

        tab[0] = new Car();
        tab[1] = new Bus();

        ((Car) tab[0]).cos();

        tab[1].jedz();

        Breakable car2 = new Motor();
        car2.napraw();
        car2.zepsuj();
        int t = car2.wyliczCeneNaprawy(5);

        Abstrakcyjna abstrakcyjna = new B();
        abstrakcyjna.b();

        Calka calka = new MojaCalka();
        calka.wyliczCalke();

        double d = 5;
        int i = (int) 5.5;
    }
}
