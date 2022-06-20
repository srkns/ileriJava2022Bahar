package tr.edu.medipol.ders4;

public class Sinif5 {

    int a = 10;

    static int b = 20;

    public Sinif5 () {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Sinif5 sinif5 = new Sinif5();
        System.out.println("sinif5.a : " + sinif5.a);

        Sinif5 sinif5_2 = new Sinif5();
        System.out.println("sinif5_2.a : " + sinif5_2.a);
    }

}
