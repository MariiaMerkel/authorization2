import excaptions.WrongLoginException;
import excaptions.WrongPasswordException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> logins = new ArrayList<>();
        logins.add("hfhfFF");
        logins.add("hfhfh_hfhfFF");
        logins.add("hfhfFF77777777777777777777777777777777777");
        logins.add("hfhFF5454");
        logins.add("hfhfh_5454");
        List<String> passwords = logins;
        List<String> confirmPasswords = logins;

        for (Object l : logins) {
            for (Object p : passwords) {
                for (Object c : confirmPasswords) {
                    try {
                        Authorization.checkLoginAndPasswords((String) l, (String) p, (String) c);
                        System.out.printf("Логин: %s и пароли корректны.%n", l);
                    } catch (WrongLoginException e) {
                        System.out.printf("Логин \"%s\" не корректен. %s.%n", l, e.getMessage());
                    } catch (WrongPasswordException e) {
                        System.out.printf("Пароли \"%s\" и \"%s\" не корректны. %s.%n", p, c, e.getMessage());
                    }
                }
            }
        }
    }
}