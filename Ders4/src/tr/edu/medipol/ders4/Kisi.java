package tr.edu.medipol.ders4;

public class Kisi {

    String ad;
    String soyad;

    public Kisi() {

    }

    public Kisi(String isim, String soyisim) {
        ad = isim;
        soyad = soyisim;
    }

    public void bilgileriniYazdir() {
        System.out.println("Kişi Bilgilerim : " + ad + " " + soyad);
    }

}
