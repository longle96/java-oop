package lab_02;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Scanner;

public class lab_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the number:");
        int InputNumber = scanner.nextInt();
            if (InputNumber % 2 == 0)
                System.out.println(InputNumber + " is even");
            else
                System.out.println(InputNumber + " is odd");
    }
}
