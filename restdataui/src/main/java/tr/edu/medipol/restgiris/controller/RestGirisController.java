package tr.edu.medipol.restgiris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.restgiris.entity.Kisi;
import tr.edu.medipol.restgiris.model.*;
import tr.edu.medipol.restgiris.repository.KisiRepository;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class RestGirisController {

    @Autowired
    KisiRepository kisiRepository;

    @GetMapping("/kisiler")
    public ArrayList<Kisi> kisileriListele() {
        ArrayList<Kisi> tumKisiler = (ArrayList<Kisi>) kisiRepository.findAll();
        System.out.println("Kişiler servisi çağrıldı! Kisi Sayısı : " + tumKisiler.size() + " Zaman: " + new Date());
        return tumKisiler;
    }

    @PostMapping("/kisiekle")
    public String kisiEkle(@RequestBody KisiInput kisiInput) {
        System.out.println("Giriş Parametreleriniz : " + kisiInput);
        Kisi kisi = new Kisi();
        kisi.setName(kisiInput.getName());
        kisi.setSurname(kisiInput.getSurname());
        kisi.setYas(kisiInput.getYas());
        kisiRepository.save(kisi);
        return "Kisi alındı";
    }

    @PostMapping("/kisiguncelle")
    public String kisiGuncelle(@RequestBody KisiGuncelleInput kisiGuncelleInput) {
        System.out.println("Giriş Parametreleriniz : " + kisiGuncelleInput);
        Kisi kisi = new Kisi();
        kisi.setId(kisiGuncelleInput.getId());
        kisi.setName(kisiGuncelleInput.getName());
        kisi.setSurname(kisiGuncelleInput.getSurname());
        kisi.setYas(kisiGuncelleInput.getYas());
        kisiRepository.save(kisi);
        return "Kişi güncellendi";
    }

    @GetMapping("/kisisil")
    public String kisiSil(Long id) {
        kisiRepository.deleteById(id);
        return id + " Nolu kisi silindi";
    }

}
