package com.antaladrien;

public abstract class Bosszuallo implements Szuperhos {
    protected double szuperero;
    protected boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Batman) {
            return true;
        } else if (szuperhos instanceof Bosszuallo) {
            return (((Bosszuallo) szuperhos).isVanEGyengesege() && szuperhos.mekkoraAzEreje() < this.szuperero) ? true : false;
        } else {
            return false;
        }
    }

    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return "Bosszuallo szuperero=" + szuperero + ", vanEGyengesege=" + vanEGyengesege;
    }
}
