import excaptions.WrongLoginException;
import excaptions.WrongPasswordException;

public class Authorization {

    static public void checkLoginAndPasswords(String login, String password, String confirmPassword) {
        if (login.length() <= 20) {
            if (login.matches("[a-zA-Z_]+")) {
            } else {
                throw new WrongLoginException("Логин должен содержать только латинские буквы и символ подчёркивания");
            }
        } else {
            throw new WrongLoginException("Логин должен содержать не больше 20 символов");
        }
        if (password.length() <= 20) {
            if (password.matches("[\\w]+")) {
            } else {
                throw new WrongPasswordException("Пароль должен содержать только цифры, латинские буквы и символ подчёркивания");
            }
        } else {
            throw new WrongPasswordException("Пароль должен содержать не больше 20 символов");
        }
        if (confirmPassword.equals(password)) {
        } else {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
