package task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerifier {
    public static void main(String[] args) throws PasswordVerifieException {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = iScanner.nextLine();
        iScanner.close();
        Pattern Numbers = Pattern.compile(".*\\d.*");
        Pattern UpperCase = Pattern.compile(".*[A-Z].*");
        Matcher matcherUC = UpperCase.matcher(pass);
        Matcher matcherNum = Numbers.matcher(pass);
        if (!pass.isEmpty() && pass.length() < 8) {
            throw new PasswordVerifieException("The password must not be less than 8(eight) characters");
        } else if (pass.isEmpty()) {
            throw new PasswordVerifieException("The password must not be empty");
        } else if (!matcherNum.find()) {
            throw new PasswordVerifieException("The password must contain at least one digit");
        } else if (!matcherUC.find()) {
            throw new PasswordVerifieException("The password must contain at least one capital letter");
        } else {
            System.out.println("The password is correct");
        }
    }
}
