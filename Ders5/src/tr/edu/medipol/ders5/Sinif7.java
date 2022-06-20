package tr.edu.medipol.ders5;

public class Sinif7 {

    public static void main(String[] args) {
        int[] intDizisi = {3, 4, 5};
        System.out.println(intDizisi[1]);
        try {
            System.out.println(intDizisi[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Hata oldu : İndisleri kontrol edin! Hata: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Hata oldu");
        } finally {
            System.out.println("İndisten alma tamamlandı.");
        }

        System.out.println("Program bitti.");

    }

}
