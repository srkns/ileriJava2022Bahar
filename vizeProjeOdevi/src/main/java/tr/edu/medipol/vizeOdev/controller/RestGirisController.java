package tr.edu.medipol.vizeOdev.controller;

import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
public class RestGirisController {

    @GetMapping("/")
    public String kok() {
        return "000 - OgrenciAd OgrenciSoyad";
    }

    @GetMapping("/soru1")
    public String bolmeIslemi(int a, int b) {
        int buyukSayi = (a > b) ? a : b;
        int kucukSayi = (a > b) ? b : a;
        //buyukSayi = Math.max(a, b);
        //kucukSayi = Math.min(a, b);
        int bolum = buyukSayi / kucukSayi;
        int kalan = buyukSayi - bolum * kucukSayi; // buyukSayi % kucukSayi;
        return String.format("Bölüm : %d Kalan : %d", bolum, kalan);
    }

    @GetMapping("/soru2")
    public String faktoriyel(int a) {
        int sonuc = 1;
        for(int i = a; i > 1; i--) {
            sonuc = sonuc * i; // sonuc *= i ;
        }

        return String.format("İşlem sonucu %d! : %d", a, sonuc);
    }

    @GetMapping("/soru3")
    public String tekSayilarCarpimi(int n) {
        int sonuc = 1;
        for(int i = n; i > 1; i--) {
            if (i%2 == 1) {
                sonuc *= i;
            }
        }

        return String.format("%d sayısından küçük tek sayıların çarpımı : %d", n, sonuc);
    }

    @GetMapping("/soru4")
    public String cemberCevreVeAlan(int cap) {
        int yariCap = cap / 2;
        double cevre = 2 * Math.PI * yariCap;
        double alan = Math.PI * yariCap * yariCap;
        return String.format("%d capli cemberin cevresi : %.5f ve alanı : %.5f", cap, cevre, alan);
    }

    @GetMapping("/soru5")
    public String metninTersi(String s) {
//        String metninTersi = "";
//        int length = s.length();// metin -> 0 m 1 e 2 t 3 i 4 n
//        for (int i = length - 1 ; i >= 0 ; i--) {
//            metninTersi = metninTersi + s.charAt(i);
//        }
        StringBuffer stringBuffer = new StringBuffer(s);
        String metninTersi = stringBuffer.reverse().toString();
        return String.format("\"%s\" metninin tersi : \"%s\"", s, metninTersi);
    }

    @GetMapping("/soru6")
    public String yildizlardanTersBasamak(int a) {
        boolean islemDurumu = false;
        String hata = "";
        File file = new File("basamak.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, false);
            for(int i = a; i > 0; i--) {
                for (int j = i; j > 0; j--) {
                    fileWriter.write("*");
                }
                fileWriter.write("\n");
            }
            fileWriter.close();
            islemDurumu = true;
        } catch (IOException e) {
            hata = e.getMessage();
        }

        return String.format("Dosya yazdirma islemi sonucu = %s dosyanın adresi : %s", islemDurumu, file.getAbsolutePath());
    }

    @GetMapping("/soru7")
    public String dizi(int a) {
        int dizi[] = new int[a];
        int enBuyukSayi = 0;
        int enBuyukSayidanKacTane = 0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random() * 9) + 1;
            if (dizi[i] > enBuyukSayi) {
                enBuyukSayi = dizi[i];
                enBuyukSayidanKacTane = 1;
            } else if (dizi[i] == enBuyukSayi) {
                enBuyukSayidanKacTane++;
            }
        }

        return String.format("%d elemanlı dizi : %s en büyük sayi : %d en büyük sayi adedi : %d", a, Arrays.toString(dizi), enBuyukSayi, enBuyukSayidanKacTane);
    }

    @GetMapping("/soru8")
    public String boslukluMetniListeyeBol(String s) {
        String[] stringDizisi = s.split(" ");
        List<String> stringList = Arrays.asList(stringDizisi);
        return String.format("\"%s\" metninden oluşan liste : %s listenin eleman sayisi : %d", s, stringList, stringList.size());
    }

}
