package com.company.polymorphismexample;

public class OdemeKontrolcusu {
    private OdemeServisi odemeServisi;

    public OdemeKontrolcusu() {
        this.odemeServisi = new OdemeServisi();
    }

    public void odemeYontemiSecVeOdemeYap(String yontem, double miktar) {
        OdemeYontemi odemeYontemi;

        switch (yontem) {
            case "KrediKarti":
                odemeYontemi = new KrediKarti();
                break;
            case "PayPal":
                odemeYontemi = new PayPal();
                break;
            case "BankaHavalesi":
                odemeYontemi = new BankaHavalesi();
                break;
            default:
                throw new IllegalArgumentException("Geçersiz ödeme yöntemi: " + yontem);
        }

        odemeServisi.setOdemeYontemi(odemeYontemi);
        odemeServisi.odemeYap(miktar);
    }

    public static void main(String[] args) {


        OdemeKontrolcusu kontrolcu = new OdemeKontrolcusu();

       
        kontrolcu.odemeYontemiSecVeOdemeYap("BankaHavalesi", 300.0);

    }
}
