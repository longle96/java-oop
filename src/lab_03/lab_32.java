package lab_03;

import java.util.Scanner;

public class lab_32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter the number of elements in an array : ");
        int Size = scanner.nextInt();
        int [] array = new int[Size];
        System.out.print(" Please Enter " + Size + " elements of an Array  : ");

        for(int i=0; i< Size; i++){
            array[i] = scanner.nextInt();
        }
        int max = array[0], min = array[0];
        for(int i=0; i<Size; i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.print(max + "is the maximum number");
        System.out.println();
        System.out.print(min + "is the minimum number");
    }
    }
