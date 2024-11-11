package com.company.polymorphismexample;

public class PayPal implements OdemeYontemi {
    @Override
    public void odemeYap(double miktar) {
        System.out.println("PayPal ile ödeme yapıldı: " + miktar + " TL");
    }
}
