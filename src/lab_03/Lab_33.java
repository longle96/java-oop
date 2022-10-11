package lab_03;

import java.util.Scanner;

public class Lab_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter the number of elements in an array : ");
        int Size = scanner.nextInt();
        int[] array = new int[Size];
        System.out.print(" Please Enter " + Size + " elements of an Array  : ");

        for (int i = 0; i < Size ; i++) {
            for (int j = i+1; j < Size ; j++) {
               int tmp = 0;
                if (array[i]>array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[i] = tmp;
                }
        }
        System.out.println(array[i]);
            }
        }
    }