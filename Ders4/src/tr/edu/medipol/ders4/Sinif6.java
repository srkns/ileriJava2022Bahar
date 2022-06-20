package tr.edu.medipol.ders4;

public class Sinif6 {

    public static void main(String[] args) {
        //erisimTest();

        Kisi kisiBir = new Kisi();
        kisiBir.bilgileriniYazdir();
        kisiBir.ad = "Medipol";
        kisiBir.soyad = "Kardes";
        kisiBir.bilgileriniYazdir();

        Kisi kisiIki = new Kisi("Saglık", "Egitim");
        kisiIki.bilgileriniYazdir();



    }

    private static void erisimTest() {
        System.out.println(Sinif5.b);

        Sinif5 sinif5 = new Sinif5();
        Sinif5 sinif5_2 = new Sinif5();
        System.out.println(sinif5.a);
        System.out.println(sinif5_2.a);
        sinif5.a = 30;
        System.out.println(sinif5.a);
        sinif5_2.a = 25;
        System.out.println(sinif5_2.a);
    }


}
