package Strings;

public class PasswordValidator {
    public static boolean isPasswordValid(String password) {
        String regex = "(?=.+[0-9])(?=.+[A-Z])(?=.+[a-z])(?=.+[!@_\\-%&$*#])[\\w!@_%*&$#/-_]{8,26}";

        return password.matches(regex);
    }

    static void main() {
        String regex = "(?=.+[78])\\d+";String regex2 = "(?!.*[78])\\d+";
//        System.out.println("88".matches(regex));
        System.out.println("123455".matches(regex2));
    }
}
