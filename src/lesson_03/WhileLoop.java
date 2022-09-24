package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

     boolean isContinuing = true;

    while(isContinuing)

    {
        System.out.println("====Game menu===");
        System.out.println("1. Generate");
        System.out.println("0. Exit");
        System.out.println("Pls input number: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if (option == 0) {
            System.out.println("Goodbye");
            isContinuing = false;
        } else if (option == 1) {
            int randomNumber = new SecureRandom().nextInt(1000);
            System.out.printf("Your random number is: %d\n", randomNumber);
        } else {
            System.out.println(" pls input the number");
        }

    }
}    }