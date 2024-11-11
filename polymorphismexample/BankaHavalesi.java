package com.company.polymorphismexample;

public class BankaHavalesi implements OdemeYontemi,Comparable {
    private int id;
    @Override
    public void odemeYap(double miktar) {
        System.out.println("Banka havalesi ile ödeme yapıldı: " + miktar + " TL");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}