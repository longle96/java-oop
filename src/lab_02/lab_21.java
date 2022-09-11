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
        float minExpectedWeight = 18.5F*(h*2);
        float maxExpectedWeight = 24.9F*(h*2);
        String text = "You are";
        if (BMI < 18.5) {
            System.out.print(text + " Underweight" + " and need to increase weight (kg) in range " + minExpectedWeight + " and " + maxExpectedWeight);}
        else if (BMI <= 24.9){
            System.out.print(text + " normal weight");}
        else if (BMI <= 30){
            System.out.print(text + " overweight" + " and need to decrease weight (kg) in range " + minExpectedWeight + " and " + maxExpectedWeight);}
        else{
            System.out.print(text + " obesity" + " and need to decrease kg weight (kg) range " + minExpectedWeight + " and " + maxExpectedWeight);}
    }
}