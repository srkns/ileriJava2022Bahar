package tr.edu.medipol.ders3;

import java.util.Locale;

public class Sinif1 {

    public Sinif1() {
        System.out.println("Sinif1 calisiyor...");

        String yazi = "Medipol";

        System.out.println(yazi);
        System.out.println("yazinin uzunlugu : " + yazi.length());
        System.out.println(yazi.toLowerCase());
        yazi = yazi.toLowerCase();
        System.out.println(yazi);
        System.out.println(yazi.toUpperCase());

        String eposta = "java@medipol.edu.tr";
        System.out.println(eposta.indexOf('@'));
        System.out.println(eposta.indexOf('.'));

        String name = "medipol";
        String surname = "universitesi";
        System.out.println("name + surname : " + name + surname);
        System.out.println(name + " " + surname);
        String bosluk = " ";
        System.out.println(name + bosluk + surname);
        String metninTumu = name + bosluk + surname;
        System.out.println(metninTumu);

        System.out.println(name.concat(surname));
        System.out.println(surname.concat(name));

        int a = 5;
        int b = 7;
        System.out.println(a + b);

        String metin = "20";

        System.out.println(a + metin);

        String univDesc = "biz \"Medipol\" \t üniversitesindeyiz \\ \\ \\";
        System.out.println(univDesc);


    }

    public static void main(String[] args) {
        new Sinif1();
    }

}
