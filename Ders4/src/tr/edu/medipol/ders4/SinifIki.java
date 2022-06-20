package tr.edu.medipol.ders4;

public class SinifIki {

    public SinifIki () {
        int toplamaIslemiSonucu = Sinif1.topla(3, 7);
        System.out.println(toplamaIslemiSonucu);

        Sinif1 sinif1 = new Sinif1();
        int cikarmaIsSon = sinif1.cikar(8, 5);
        System.out.println(cikarmaIsSon);

        // private metod olduğu için çağrılamaz
        //Sinif1.buyukHarfeDonustur("sdasdas");
        //sinif1.buyukHarfeDonustur("sdasdasda");

        String kucukHarfeDonusenString = sinif1.kucukHarfeDonustur("SDFJKSDŞFLASLDŞA");
        System.out.println(kucukHarfeDonusenString);
    }

    public static void main(String[] args) {
        new SinifIki();
    }

}
