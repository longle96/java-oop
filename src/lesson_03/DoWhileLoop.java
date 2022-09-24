package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int guesstimate = 0;
        int randomNumber = new SecureRandom().nextInt();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pls input the number: ");
            int userNum = scanner.nextInt();
            if (userNum == randomNumber){
            System.out.println("Horrayyy!!!");
            break;
        }
        guesstimate++;
    } while(guesstimate < 3);
        if (guesstimate == 3){
            System.out.println("Good luck!!!");}
    }
}
