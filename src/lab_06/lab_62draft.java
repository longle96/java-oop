package lab_06;

import java.util.Arrays;
import java.util.Scanner;

public class lab_62draft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter the password: ");
        char myPassword = scanner.next().charAt(0);
        int digitCount = 0, lowerCount = 0,upperCount = 0;
        {
            if (Character.isDigit(myPassword))
                digitCount++;
            else if (Character.isLowerCase(myPassword))
                lowerCount++;
            else if (Character.isUpperCase(myPassword))
                upperCount++;
        }
        int count = 0;
        while(count <=3) {
            if (digitCount > 0 && lowerCount > 0 && upperCount < 0)
                System.out.println("Ok");
            else{
                System.out.println("Not ok");
            break;
        }
        count++;

    }
        if (count > 3)
            System.out.println("You have entered wrong three times. Please try again in a few hours");

        System.exit(0);

    } }
