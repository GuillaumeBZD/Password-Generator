import models.PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // choose password length
         System.out.print("Choose password length : ");
         int theLength = Integer.parseInt(scanner.nextLine());
         System.out.println("Password length is : " + theLength);
        PasswordGenerator.generatePassword(theLength);
         // nombre = 48 - 57
        // lettre lower = 97 - 122
        // lettre upper = 65 - 90
        // caracters = 33 35 36 38 40 41 47 63 64 95 92
    }
}