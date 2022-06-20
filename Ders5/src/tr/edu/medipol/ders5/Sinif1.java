package tr.edu.medipol.ders5;

public class Sinif1 {

    private String sinifAdi = "Sinif1:";
    private int sinifCarpani = 100;

    public Sinif1 () {
        //
    }

    public String getSinifAdi() {
        return sinifAdi;
    }

    public int getSinifCarpani() {
        System.out.println("getSinifCarpani metodu cagirildi");
        return sinifCarpani;
    }

    public void setSinifCarpani(int sinifCarpani) {
        System.out.println("setSinifCarpani metodu cagirildi");
        this.sinifCarpani = sinifCarpani;
    }

    public String stringTopla(String a, String b) {
        return sinifAdi + a + " " + b;
    }

    public String stringCokla(String a) {
        return sinifAdi + a + " " + a;
    }

    public int intTopla(int a, int  b) {
        return sinifCarpani * (a + b);
    }

    public static void main(String[] args) {
        String str1 = new String("Medipol");
        String str2 = new String("Üniversitesi");
        Sinif1 yuzleCarpan = new Sinif1();

        System.out.println(yuzleCarpan.sinifAdi);
        System.out.println(yuzleCarpan.sinifCarpani);

        yuzleCarpan.sinifCarpani = 10000;

        String sonuc = yuzleCarpan.stringTopla(str1, str2);
        System.out.println(sonuc);

        int i = yuzleCarpan.intTopla(3, 5);
        System.out.println(i);

        String sonuc2 = yuzleCarpan.stringCokla("Cok");
        System.out.println(sonuc2);

        Sinif1 binleCarpan = new Sinif1();
        binleCarpan.setSinifCarpani(1000);
        System.out.println(binleCarpan.getSinifCarpani());

        int binliSonuc = binleCarpan.intTopla(3, 5);
        System.out.println("binliSonuc : " + binliSonuc);

    }

}
