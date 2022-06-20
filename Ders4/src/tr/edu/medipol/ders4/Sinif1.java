package tr.edu.medipol.ders4;

import java.util.Date;
import java.util.Locale;

public class Sinif1 {

    public Sinif1 () {
        System.out.println("Sinif1 calisiyor.");
    }

    public static void main(String[] args) {

        int sonuc1 = Sinif1.topla(1, 2);
        System.out.println(sonuc1);

        Sinif1 sinif1 = new Sinif1();
        int sonuc2 = sinif1.cikar(5, 3);
        System.out.println(sonuc2);

        String ad = "Yusuf";
        String soyad = "DAYI";

        String adSoyad = sinif1.adSoyadBirlestir(ad, soyad);
        System.out.println(adSoyad);

        sinif1.adSoyadBirlestirVeYaz(ad, soyad);
        sinif1.bugununTarihiniYaz();

        System.out.println(sinif1.buyukHarfeDonustur("hikarıoğüşiçö"));
    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public int cikar(int a, int b) {
        return a - b;
    }

    public String adSoyadBirlestir(String ad, String soyad) {
        return ad + " " + soyad;
    }

    public void adSoyadBirlestirVeYaz(String ad, String soyad) {
        System.out.println(ad + " " + soyad);
    }

    public void bugununTarihiniYaz() {
        System.out.println(new Date());
    }

    private String buyukHarfeDonustur(String s) {
        return s.toUpperCase();
    }

    protected String kucukHarfeDonustur(String s) {
        return s.toLowerCase();
    }



}
