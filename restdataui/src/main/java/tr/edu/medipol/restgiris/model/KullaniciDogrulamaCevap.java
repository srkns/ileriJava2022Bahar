package tr.edu.medipol.restgiris.model;

import lombok.Data;

import java.util.Date;

@Data
public class KullaniciDogrulamaCevap {

    boolean oturumAcildi;
    String fullName;
    Date sonOturumAcmaTarihi;

}
