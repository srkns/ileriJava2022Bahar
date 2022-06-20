package tr.edu.medipol.ders4;

public class Sinif4 {

    public Sinif4() {
        String bir = "ğpğpüpüğ";
        String iki = "asdlaşskdşa";
        System.out.println(buyukHarfeDonustur(bir));
        System.out.println(buyukHarfeDonustur(bir, iki));

        //kapsamTest();

        int sonuc = faktoriyel(3);
        System.out.println(sonuc);
    }

    public int faktoriyel(int n) {
        System.out.println("faktoriyel metodu cagirildi : " + n);
        if (n == 0) {
            return 1;
        } else {
            return (n * faktoriyel(n - 1));
        }
    }

    private void kapsamTest() {
        // bir farklı bir kapsamda olduğu için erişilemiyor.
        //System.out.println(bir);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // i sadece for blogu içinden erişilebilir.
        //System.out.println("i nin son degeri : " + i);

        // x henüz tanımlı değil
        //System.out.println(x);
        int x = 10;
        System.out.println(x);

    }

    public static void main(String[] args) {
        new Sinif4();
        // c farklı bir kapsamda olduğu için erişilemiyor.
        //System.out.println(c);
    }

    public String buyukHarfeDonustur(String a) {
        int c = 0;
        return a.toUpperCase();
    }

    public String buyukHarfeDonustur(String a, String b) {
        return a.toUpperCase() + b.toUpperCase();
    }

}
