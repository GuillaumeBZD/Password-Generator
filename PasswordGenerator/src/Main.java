import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // choose password length
         System.out.print("Choose password length : ");
         int length = Integer.parseInt(scanner.nextLine());
         System.out.println("Password length is : " + length);

         // nombre = 48 - 57
        // lettre lower = 97 - 122
        // lettre upper = 65 - 90
        // caracters = 33 35 36 38 40 41 47 63 64 95 92

        String finalPassword = "";
        for (int i = 0; i < length; i++) {
            int randomPicking = random.nextInt(33, 122 +1);
            char convertedToChar = (char)randomPicking;
            finalPassword = finalPassword + convertedToChar;

        }
        System.out.println("Password is " + finalPassword);

    }
}