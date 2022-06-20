package tr.edu.medipol.vizeOdev.model;

import lombok.Data;

@Data
public class KullaniciDogrulama {

    String username;

    String password;

    public boolean kullaniciyiDogrula() {
        if ("medipol".equals(username) && "kardes".equals(password)) {
            return true;
        }
        return false;
    }

}
