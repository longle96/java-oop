package lab_03;

import java.util.Scanner;

public class lab_31 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter the number of elements in an array : ");
        int Size = scanner.nextInt();
        int [] array = new int[Size];
        System.out.print(" Please Enter " + Size + " elements of an Array  : ");

        int i = 0, j = 0, evenCount = 0, oddCount = 0;
        while (i < Size)
        {
            array[i] = scanner.nextInt();
            i++;
        }
        while(j < Size)
        {
            if(array[j] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            j++;
        }
        System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
        System.out.println("\n Total Number of Odd Numbers in this Array = " + oddCount);

    }
}
