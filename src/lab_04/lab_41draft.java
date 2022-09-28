package lab_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class lab_41draft {
    public static void main(String[] args) {
        boolean isContinuing = true;

        while (isContinuing) {
            System.out.println("====Game menu===");
            System.out.println("1. Generate");
            System.out.println("0. Exit");
            System.out.println("Pls input number: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            System.out.print(" Please enter the number of elements in an array : ");
            int Size = scanner.nextInt();
            int[] array = new int[Size];
            System.out.print(" Please Enter " + Size + " elements of an Array  : ");

            if (option == 0) {
                System.out.println("Goodbye");
                isContinuing = false;
            } else if (option == 1) {
                System.out.println(array);
            } else if (option == 2) {
                for (int i = 0; i < Size; i++) {
                    array[i] = scanner.nextInt();
                }
                int max = array[0];
                for (int i = 0; i < Size; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                System.out.println(max + " is the maximum number");
            } else if (option == 3) {
                for (int i = 0; i < Size; i++) {
                    array[i] = scanner.nextInt();
                }
                int min = array[0];
                for (int i = 0; i < Size; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                System.out.println(min + " is the minimum number");
            }
        }
    }
}