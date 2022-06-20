public class Sinif2 {

    public Sinif2() {
        System.out.println("Sinif2 calisiyor");

        int a = 5;
        int b = 7;
        int sonuc = toplaVeModAl(a, b);
        System.out.println("Toplama(mod10) işlemi sonucu : " + sonuc);

        System.out.println("Sinif2'den cikiliyor...");
    }

    private int toplaVeModAl(int a, int b) {
        int metod_sonuc = a + b;
        if (metod_sonuc > 10) {
            System.out.println("Mod dönülüyor");
            return metod_sonuc % 10;
        }
        System.out.println("Toplama sonucu dönülüyor");
        return metod_sonuc;
    }

    public static void main(String[] args) {
        System.out.println("Sinif2.main()'e girdi");
        new Sinif2();
        System.out.println("Sinif2.main()'den çıktı");
    }

}
