public class Sinif {

    // Constructor
    // Yapıcı metod
    public Sinif() {
        System.out.println("Sinif olustu");
    }

    /*
        Main metodu. Programin calistirdi ilk metod. Giriş noktasi
     */
    public static void main(String []args) {
        // Programın çalıştığında ilk yaptığı iş selamlamak
        System.out.println("Merhaba Medipol");

        //topla(1, 2);
        int cikarma_sonucu = cikar(5, 3);
        System.out.println(cikarma_sonucu);

        Sinif sinif = new Sinif();
        int toplama_sonucu = sinif.topla(3, 5);
        System.out.println(toplama_sonucu);

        Sinif2 sinif2 = new Sinif2();
        System.out.println(sinif2.carp(5, 7));

        Sinif2.sinif2Selam();

        Sinif2 sinif2_kopya_2 = new Sinif2();

    }

    public int topla(int a, int b) {
        return a + b;
    }

    public static int cikar(int a, int b) {
        return a - b;
    }

}
