package tr.edu.medipol.ders5;

public class Sinif2 {

    public static void main(String[] args) {
        Sinif1 sinif1 = new Sinif1();
        System.out.println(sinif1.getSinifAdi());
        // private olduğu için hata alacaktır
        //sinif1.sinifCarpani = 10;
        // değiştirmek için set metodu çağrılır
        sinif1.setSinifCarpani(100);
    }

}
