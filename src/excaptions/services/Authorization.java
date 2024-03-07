package excaptions.services;

import excaptions.WrongLoginException;
import excaptions.WrongPasswordException;

public class Authorization {
    public static void checkLoginAndPasswords(AuthorizationRecord a) {
        try {
            Authorization.checkLogin(a.login());
            System.out.printf("Логин %s корректен. ", a.login());
            Authorization.checkPassword(a.password());
            System.out.printf("Пароль %s корректен. ", a.password());
            Authorization.checkConfirmPassword(a.password(), a.confirmPassword());
            System.out.printf("Пароли %s и %s совпадают.%n", a.password(), a.confirmPassword());
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace(); todo
        }
    }

    private static void checkLogin(String login) {
        if (login.length() > 20) {
            throw new WrongLoginException(String.format("Логин %s не корректен. Логин должен содержать не больше 20 символов. ", login));
        }
        if (!login.matches("[\\w]+")) {
            throw new WrongLoginException(String.format("Логин %s не корректен. Логин должен содержать только цифры, латинские буквы и символ подчёркивания. ", login));
        }
    }

    private static void checkPassword(String password) {
        if (password.length() > 20) {
            throw new WrongPasswordException(String.format("Пароль %s не корректен. Пароль должен содержать не больше 20 символов. ", password));
        }
        if (!password.matches("[\\w]+")) {
            throw new WrongPasswordException(String.format("Пароль %s не корректен. Пароль должен содержать только цифры, латинские буквы и символ подчёркивания. ", password));
        }
    }

    private static void checkConfirmPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(String.format("Пароли %s и %s не совпадают.", password, confirmPassword));
        }
    }
}
