import excaptions.services.Authorization;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Authorization> authorizationList = new ArrayList<>();
        authorizationList.add(new Authorization("hfhf_FF", "hfhf_FF", "hfhf_FF"));
        authorizationList.add(new Authorization("hfhfh//hfFF", "hfhf_54FF", "hfhf_54FF"));
        authorizationList.add(new Authorization("hfhf_54FF", "hfhfh//hfFF", "hfhf_54FF"));
        authorizationList.add(new Authorization("hfhf_54FF", "hfhf_54FF", "hfhfh//hfFF"));
        authorizationList.add(new Authorization("hfhfh//hfFF", "hfhfh//hfFF", "hfhf_54FF"));
        authorizationList.add(new Authorization("hfhfh//hfFF", "hfhf_54FF", "hfhfh//hfFF"));
        authorizationList.add(new Authorization("hfhfh//hfFF", "hfhfh//hfFF", "hfhfh//hfFF"));
        authorizationList.add(new Authorization("hfhfFF77777777777777777", "hfhf_54FF", "hfhf_54FF"));
        authorizationList.add(new Authorization("hfhf_54FF", "hfhfFF77777777777777777", "hfhf_54FF"));
        authorizationList.add(new Authorization("hfhf_54FF", "hfhf_54FF", "hfhfFF77777777777777777"));
        authorizationList.add(new Authorization("hfhfFF77777777777777777", "hfhfFF77777777777777777", "hfhf_54FF"));
        authorizationList.add(new Authorization("hfhfFF77777777777777777", "hfhf_54FF", "hfhfFF77777777777777777"));
        authorizationList.add(new Authorization("hfhf_54FF", "hfhfFF77777777777777777", "hfhf_54FF"));
        authorizationList.add(new Authorization("hfhf_54FF", "hfhf_54FF", "hfhfFF77777777777777777"));
        authorizationList.add(new Authorization("hfhf_54FF", "hfhfFF77777777777777777", "hfhfFF77777777777777777"));
        authorizationList.add(new Authorization("hfhfFF77777777777777777", "hfhfFF77777777777777777", "hfhfFF77777777777777777"));

        authorizationList.forEach(a -> Authorization.checkLoginAndPasswords(a));
    }
}