import services.Authorization;
import services.AuthorizationRecord;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<AuthorizationRecord> authorizationList = new ArrayList<>();
        authorizationList.add(new AuthorizationRecord("hfhf_FF", "hfhf_FF", "hfhf_FF"));
        authorizationList.add(new AuthorizationRecord("hfhfh//hfFF", "hfhf_54FF", "hfhf_54FF"));
        authorizationList.add(new AuthorizationRecord("hfhf_54FF", "hfhfh//hfFF", "hfhf_54FF"));
        authorizationList.add(new AuthorizationRecord("hfhf_54FF", "hfhf_54FF", "hfhfh//hfFF"));
        authorizationList.add(new AuthorizationRecord("hfhfh//hfFF", "hfhfh//hfFF", "hfhf_54FF"));
        authorizationList.add(new AuthorizationRecord("hfhfh//hfFF", "hfhf_54FF", "hfhfh//hfFF"));
        authorizationList.add(new AuthorizationRecord("hfhfh//hfFF", "hfhfh//hfFF", "hfhfh//hfFF"));
        authorizationList.add(new AuthorizationRecord("hfhfFF77777777777777777", "hfhf_54FF", "hfhf_54FF"));
        authorizationList.add(new AuthorizationRecord("hfhf_54FF", "hfhfFF77777777777777777", "hfhf_54FF"));
        authorizationList.add(new AuthorizationRecord("hfhf_54FF", "hfhf_54FF", "hfhfFF77777777777777777"));
        authorizationList.add(new AuthorizationRecord("hfhfFF77777777777777777", "hfhfFF77777777777777777", "hfhf_54FF"));
        authorizationList.add(new AuthorizationRecord("hfhfFF77777777777777777", "hfhf_54FF", "hfhfFF77777777777777777"));
        authorizationList.add(new AuthorizationRecord("hfhf_54FF", "hfhfFF77777777777777777", "hfhf_54FF"));
        authorizationList.add(new AuthorizationRecord("hfhf_54FF", "hfhf_54FF", "hfhfFF77777777777777777"));
        authorizationList.add(new AuthorizationRecord("hfhf_54FF", "hfhfFF77777777777777777", "hfhfFF77777777777777777"));
        authorizationList.add(new AuthorizationRecord("hfhfFF77777777777777777", "hfhfFF77777777777777777", "hfhfFF77777777777777777"));

        authorizationList.forEach(Authorization::checkLoginAndPasswords);
    }
}