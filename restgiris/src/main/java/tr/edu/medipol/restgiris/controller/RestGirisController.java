package tr.edu.medipol.restgiris.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.medipol.restgiris.model.KullaniciDogrulama;
import tr.edu.medipol.restgiris.model.KullaniciDogrulamaCevap;

import java.util.Date;

@RestController
public class RestGirisController {

    @GetMapping("/")
    public String kok() {
        return "İleri Java Uygulamaları - Ders 6'da yazılan RestFUL servisleri";
    }

    @GetMapping("/selam")
    public String selamlama() {
        return "selam";
    }

    @GetMapping("/topla")
    public int topla(int sayiBir, int sayiIki) {
        return sayiBir + sayiIki;
    }

    @GetMapping("metinleriTopla")
    public String metinTopla(String metinBir, String metinIki) {
        return metinBir + " " + metinIki;
    }

    @PostMapping("kullaniciKontrol")
    public boolean kullaniciKontrolYap(String username, String password) {
        if ("medipol".equals(username) && "kardes".equals(password)) {
            return true;
        }
        return false;
    }

    @PostMapping("kullaniciKontrolIki")
    public boolean kullaniciKontrolIkiyiYap(@RequestBody KullaniciDogrulama kullaniciDogrulama) {
        return kullaniciDogrulama.kullaniciyiDogrula();
    }

    @PostMapping("kullaniciKontrolUc")
    public KullaniciDogrulamaCevap kullaniciKontrolUcYap(@RequestBody KullaniciDogrulama kullaniciDogrulama) {
        KullaniciDogrulamaCevap kullaniciDogrulamaCevap = new KullaniciDogrulamaCevap();
        kullaniciDogrulamaCevap.setOturumAcildi(kullaniciDogrulama.kullaniciyiDogrula());
        kullaniciDogrulamaCevap.setFullName("Medipol Kardeş");
        kullaniciDogrulamaCevap.setSonOturumAcmaTarihi(new Date());
        return kullaniciDogrulamaCevap;
    }

    @GetMapping("/asalSayimidir")
    public String asalSayilariGetir(int sayi) {
        String sonuc;
        int sayac = 0;
        for(int i = 2; i < sayi; i++) {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            sonuc = sayi + " Asal bir sayidir.";
        }
        else {
            sonuc = sayi + " Asal bir sayi degildir.";
        }
        return sonuc;
    }

}
