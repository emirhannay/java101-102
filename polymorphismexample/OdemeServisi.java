package com.company.polymorphismexample;

public class OdemeServisi implements Comparable {
    private OdemeYontemi odemeYontemi;

    public void setOdemeYontemi(OdemeYontemi odemeYontemi) {
        this.odemeYontemi = odemeYontemi;
    }

    public void odemeYap(double miktar) {
        odemeYontemi.odemeYap(miktar);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}