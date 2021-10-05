package com.comarch.modyfikatory;

public class Square {
    private int side;
    private int field;
    private int circuit;

    public Square(int side, int field, int circuit) {
        this.side = side;
        this.field = field;
        this.circuit = circuit;
    }

    int getSide() {
        return side;
    }

    public int getField() {
        return field;
    }

    public int getCircuit() {
        return circuit;
    }

    public void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;
    }
}
