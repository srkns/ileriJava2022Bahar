public class Sinif3 {

    public Sinif3() {
        System.out.println("Sinif3 calisiyor");

        degiskenler1();
        degiskenler2();
        degiskenler3();

        System.out.println("Sinif3'den cikiliyor...");
    }

    private void degiskenler3() {
        String metin = "Medipol Universitesi";
        System.out.println("metin : " + metin);
        System.out.println("metnin ilk kismi : " + metin.substring(0,7));

        int g = 4;

        double double_sayi = 19.99d;
        System.out.println("double_sayi : " + double_sayi);

        double double_sayi2 = 9.78d;
        // compiler hata verir. daraltacağımız türü ister
        //int int2 = double_sayi2;
        int int2 = (int) double_sayi2; // 9

        System.out.println("double_sayi2 : " + double_sayi2);
        System.out.println("int2 : " + int2);

        int2++;
        System.out.println("int2 : " + int2);
        int2++;
        System.out.println("int2 : " + int2);

        int2--;
        System.out.println("int2 : " + int2);

        System.out.println("++int2 : " + ++int2);
        System.out.println("--int2 : " + --int2);

        int a = 6;
        int b = 8;
        System.out.println("a b : " + a + " " + b);
        System.out.println("a + b : " + (a + b++));
        a = 6; b =8;
        System.out.println("a + b : " + (a + ++b));

        // a++ => a = a + 1; => a += 1;

        int x = 10;
        System.out.println("x : " + x);
        x += 5; // x = x + 5;
        System.out.println("x : " + x);

        int h = 5;
        int j = 9;
        System.out.println("5 == 9 : " + (5 == 9));
        System.out.println("5 >= 9 : " + (5 >= 9));
        System.out.println("5 <= 9 : " + (5 <= 9));

    }

    private void degiskenler2() {
        String metin_1 = "metin1";
        String metin_2 = "metin2";
        String metinler = metin_1 + metin_2;
        System.out.println(metinler);
        System.out.println(metin_1 + metin_2);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        int k = 5, t = 6, l = 50;

        System.out.println("k:" + k + " t:" + t + " l:" + l);

        int d = 60;
        int bir_saat_icindeki_dakika_sayisi = 60;
        int saat = 5;
        int dakika = saat * d;
        int dakika2 = saat * bir_saat_icindeki_dakika_sayisi;

    }

    private void degiskenler1() {
        String metin = "Medipol";
        char karakter = 'a';
        int sayi = 5;
        float virgullu_sayi = 1.204f;
        boolean dogru_yanlis = false;

        System.out.println("metin : " + metin);
        System.out.println("karakter : " + karakter);
        System.out.println("sayi : " + sayi);
        System.out.println("virgullu_sayi : " + virgullu_sayi);
        System.out.println("dogru_yanlis : " + dogru_yanlis);

        if (dogru_yanlis) {
            System.out.println("DOĞRU");
        } else {
            System.out.println("YANLIŞ");
        }

        dogru_yanlis = true;

        if (dogru_yanlis) {
            System.out.println("DOĞRU");
        } else {
            System.out.println("YANLIŞ");
        }

        final int sabit_sayi = 20;
        System.out.println("sabit_sayi : " + sabit_sayi);

        // compiler hata verecek ve derlemeyecek
//        sabit_sayi = 25;
//        System.out.println("sabit_sayi : " + sabit_sayi);
    }

    public static void main(String[] args) {
        System.out.println("Sinif3.main()'e girdi");
        new Sinif3();
        System.out.println("Sinif3.main()'den çıktı");
    }

}
