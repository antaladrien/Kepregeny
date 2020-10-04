package com.antaladrien;

public class Vasember extends Bosszuallo implements Milliardos {
    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return this.szuperero > 1000 ? true : false;
    }

    @Override
    public void kutyutKeszit() {
        this.szuperero += (Math.random() * 10);
    }

    @Override
    public String toString() {
        return "Vasember " + super.toString();
    }
}
