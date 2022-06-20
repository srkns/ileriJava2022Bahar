package tr.edu.medipol.vizeOdev.model;

import lombok.Data;

import java.util.Date;

@Data
public class KullaniciDogrulamaCevap {

    boolean oturumAcildi;
    String fullName;
    Date sonOturumAcmaTarihi;

}
