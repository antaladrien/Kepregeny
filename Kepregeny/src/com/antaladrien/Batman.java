package com.antaladrien;

public class Batman implements Szuperhos, Milliardos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return szuperhos.mekkoraAzEreje() < this.lelemenyesseg ? true : false;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.lelemenyesseg*2;
    }

    @Override
    public String toString() {
        return "Batman lelemenyesseg=" + lelemenyesseg;
    }
}
