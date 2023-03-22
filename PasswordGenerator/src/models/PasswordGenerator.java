package models;

import java.util.Random;
import static java.lang.System.*;

public class PasswordGenerator {

    public static String generatePassword(int length) {
        Random random = new Random();
        String finalPassword = "";
        for (int i = 0; i < length; i++) {
            int randomPicking = random.nextInt(33, 122 +1);
            char convertedToChar = (char)randomPicking;
            finalPassword = finalPassword + convertedToChar;

        }
         System.out.println("Password is " + finalPassword);
        return finalPassword;
    }
}
