package com.comarch.dziedziczenie;

public class Car extends Vehicle implements Breakable {

    public void cos() {
        this.brand = "sdf";
        this.plate = "dsaf";
        this.vin = "dfgsdf";
        //this.model = "dsfgsd";
    }

    @Override
    public void zepsuj() {

    }

    @Override
    public void napraw() {

    }

    @Override
    public int wyliczCeneNaprawy(int a) {
        return 0;
    }

    @Override
    public void a() {

    }
}
