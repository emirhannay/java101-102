package com.company.polymorphismexample;

public class KrediKarti implements OdemeYontemi {
    @Override
    public void odemeYap(double miktar) {
        System.out.println("Kredi kartı ile ödeme yapıldı: " + miktar + " TL");
    }
}
