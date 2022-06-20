package tr.edu.medipol.ders3;

public class Sinif3 {

    public Sinif3 () {
        System.out.println("Sinif3 calisiyor...");

        //ifElse();
        //switchIfadesi();
        //whileIfadesi();
        //forIfadesi();
        diziler();
    }

    private void diziler() {

        int[] sayiDizisi = {10, 20, 30, 40};
        for (int i : sayiDizisi) {
            System.out.println(i);
        }

        for(int i = 0; i < sayiDizisi.length; i++) {
            System.out.println("i : " + i);
            System.out.println("sayiDizisi elemanı : " + sayiDizisi[i]);
        }

        System.out.println("\n\n");

        sayiDizisi[2] = 50;
        for(int i = 0; i < sayiDizisi.length; i++) {
            System.out.println("i : " + i);
            System.out.println("sayiDizisi elemanı : " + sayiDizisi[i]);
        }

        int[] dizi = {10, 20};
        int a = 5, b = 5;
        int c = 7, d[] = {7, 8};

        int[] k = {40, 50};
        int l[] = {50, 60};

        int[] h = {2}, j = {3};

        //int y = 5;
        //int u = 9;
        int y = 5, u = 9;

        int[] e = {}, f = {};
        int r = 7, w[] = {}, q = 0, z[] = {};

        int[][] ikiBoyutluDizi = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(ikiBoyutluDizi[1][2]);
        int s[] = ikiBoyutluDizi[0];
        System.out.println("s[2] :  " + s[2]);

        s = ikiBoyutluDizi[1]; // {5, 6, 7}
        System.out.println("s[2] :  " + s[2]);
        //System.out.println("s[3] :  " + s[3]); // java.lang.ArrayIndexOutOfBoundsException: 3

        ikiBoyutluDiziyiYazdir(ikiBoyutluDizi);

    }

    private void ikiBoyutluDiziyiYazdir(int[][] ikiBoyutluDizi) {
        // int[][] ikiBoyutluDizi = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println("Dizinin uzunlugu: " + ikiBoyutluDizi.length);
        for (int i = 0; i < ikiBoyutluDizi.length; i++) {
            System.out.println("-");
            for (int j = 0; j < ikiBoyutluDizi[i].length; j++) {
                System.out.println("[i][j]=" + i + "," + j + ":" + ikiBoyutluDizi[i][j]);
            }
            System.out.println("--");
        }
    }

    private void forIfadesi() {

        for (int i = 0; i < 7; i++) {
            System.out.println(i);
        }

        System.out.println("\n\n");

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "TOGG"};
        for (String str : cars) {
            System.out.println(str);
        }

        System.out.println("\n\n");

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\n\n");

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }

    private void whileIfadesi() {

        int i = 10;
        while (i < 20) {
            System.out.println("i:" + i);
            i += 5;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);


    }

    private void switchIfadesi() {

        int gun = 6;
        String hangiGun;

        switch (gun) {
            case 1:
                hangiGun = "Pazartesi";
                break;
            case 2:
                hangiGun = "Salı";
                break;
            case 3:
                hangiGun = "Çarşamba";
                break;
            case 4:
                hangiGun = "Perşembe";
                break;
            case 5:
                hangiGun = "Cuma";
                break;
            default:
                hangiGun = "Hafta içi değil!";
        }
        System.out.println(hangiGun);

    }

    private void ifElse() {
        int a = 7;
        int b = 5;
        int c = 5;
        if (a > b) {
            System.out.println("a, b'den büyüktür");
        }

        if (a < c) {
            System.out.println("a, c'den küçüktür");
        }

        if (b == c) {
            System.out.println("b c'ye eşittir");
        }

        if (a != c) {
            System.out.println("a c'ye eşit değildir");
        } else {
            System.out.println("a c'ye eşittir");
        }

        if (a < c) {
            System.out.println("a c'den küçüktür");
        } else {
            System.out.println("a c'ye eşit veya büyüktür");
        }

        if (a < c) {
            System.out.println("a c'den küçüktür");
        } else if (a > c) {
            System.out.println("a c'den büyüktür");
        } else {
            System.out.println("a c'ye eşittir");
        }

        if (a < c) {
            System.out.println("a c'den küçüktür");
        } else if (a > c) {
            System.out.println("a c'den büyüktür");
        }

        if (a < c) {
            System.out.println("a c'den küçükmü işleminin sonucu : ");
            System.out.println("a c'den küçüktür");
        }

        if (a > c) {
            System.out.println("a c'den büyükmü işleminin sonucu : ");
            System.out.println("a c'den büyüktür");
        }

//        int a = 7;
//        int b = 5;
//        int c = 5;
        if (a < c) {
            System.out.println("a c'den küçüktür");
        } else if (a == c) {
            System.out.println("a c'ye eşittir");
        } else if (a > b) {
            System.out.println("a b'den büyüktür");
        } else {
            System.out.println("a c'ye eşittir");
        }

        int aVeBdenBuyukOlani = (a > b) ? a : b;// tek satirda if
        System.out.println("işlem sonucu : " + aVeBdenBuyukOlani);

        aVeBdenBuyukOlani = 0;
        System.out.println("aVeBdenBuyukOlani : " + aVeBdenBuyukOlani);
        if (a > b) {
            aVeBdenBuyukOlani = a;
        } else {
            aVeBdenBuyukOlani = b;
        }
        System.out.println("işlem sonucu : " + aVeBdenBuyukOlani);


    }

    public static void main(String[] args) {
        new Sinif3();
    }

}
