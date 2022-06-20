package tr.edu.medipol.derstemp;

import tr.edu.medipol.ders4.Sinif1;

public class Sinif3 {

    public Sinif3 () {
        // protected olduğu için çağrılamıyor
        //Sinif1.kucukHarfeDonustur("HKJHJKHK");

        Sinif1 sinif1 = new Sinif1();

        // protected olduğu için çağrılamıyor
        //sinif1.kucukHarfeDonustur("JKLJLKJLKJL");
    }

    public static void main(String[] args) {
        new Sinif3();
    }

}
