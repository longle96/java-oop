package lesson_04;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap: ");
        int userInput = scanner.nextInt();
        switch (userInput){
        case 1:
            System.out.println("Giai 1"); break;
            case 2:
                System.out.println("Giai 2"); break;
                case 3:
                 System.out.println("Giai 3"); break;
            default:
                System.out.println(" Vui long nhap lai");
        break;}}}