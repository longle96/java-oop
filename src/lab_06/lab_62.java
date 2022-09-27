package lab_06;

import java.util.Scanner;

public class lab_62 {public static void main(String[] args) {
    int count = 0;
    do {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter the password: ");
        String myPassword = scanner.nextLine();
        char[] myCharPassword = myPassword.toCharArray();


        int digitCount = 0, lowerCount = 0;
        for (char password : myCharPassword) {
            if (Character.isDigit(password))
                digitCount++;
            else if (Character.isLowerCase(password))
                lowerCount++;
        }
        String result = (digitCount > 0 && lowerCount > 0) ? "Ok" : "Not OK";
        System.out.println(result);
        count++;}
    while (count < 3);
    if (count == 3) {
        System.out.println("You have entered wrong three times. Please try again in a few hours");
    }
}
}
