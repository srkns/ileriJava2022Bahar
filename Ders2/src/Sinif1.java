public class Sinif1 {

    public Sinif1() {
        System.out.println("Sinif1 calisiyor");

        int a = 5;
        int b = 7;
        int sonuc = topla(a, b);
        System.out.println("Toplama işlemi sonucu : " + sonuc);

        System.out.println("Sinif1'den cikiliyor...");
    }

    private int topla(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sinif1.main()'e girdi");
        new Sinif1();
        System.out.println("Sinif1.main()'den çıktı");
    }

}
