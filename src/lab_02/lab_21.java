package lab_02;

import java.util.Scanner;

public class lab_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Please input height (m): ");
        float h = scanner.nextFloat();
        System.out.print("Please input weight (kg): ");
        float w = scanner.nextFloat();
        float BMI = w/(h*2);
        System.out.println("Your BMI is " + BMI);
        if (BMI <= 18.5)
            System.out.print("Underweight");
        else if (BMI <= 24.9)
            System.out.print("Normal weight");
        else if (BMI <= 30)
            System.out.print("Overweight");
        else
            System.out.print("Ovbesity");


    }
}
