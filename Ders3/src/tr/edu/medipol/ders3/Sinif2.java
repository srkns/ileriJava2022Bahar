package tr.edu.medipol.ders3;

public class Sinif2 {

    public Sinif2 () {
        int sayi1 = 5;
        int sayi2 = 10;
        int buyuk_sayi = Math.max(sayi1, sayi2);
        System.out.println(buyuk_sayi);

        System.out.println(Math.min(sayi1, sayi2));
        System.out.println(Math.min(sayi2, sayi1));

        double karekok = 64;
        System.out.println(Math.sqrt(karekok));

        System.out.println(Math.abs(-4.4));

        System.out.println("Rastgele bir sayi : " + Math.random() * 10);
        System.out.println("Rastgele bir sayi : " + Math.random() * 10);
        System.out.println("Rastgele bir sayi : " + Math.random() * 10);


    }

    public static void main(String[] args) {
        new Sinif2();
    }

}
