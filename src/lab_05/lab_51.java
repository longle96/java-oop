package lab_05;

import java.util.*;

public class lab_51 {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing) {
            printMenuGame();
            int option = getUserInput();
            switch (option) {
                case 0:
                    System.out.println("Goodbye");
                    isContinuing = false;
                    break;
                case 1:
                    addNumberToArray(myArrayList);
                    break;
                case 2:
                    printArray(myArrayList);
                    break;
                case 3:
                    getMaxNumber(myArrayList);
                    break;
                case 4:
                    getMinNumber(myArrayList);
                    break;
                case 5:
                    searchNumber(myArrayList);
                default:
                    System.out.println("Pls input another number!!!");
            }

        }
    }

    private static void printMenuGame() {
        System.out.println("====Game menu===");
        System.out.println("1. Generate");
        System.out.println("2. Print");
        System.out.println("3. Max");
        System.out.println("4. Min");
        System.out.println("5. Search number");
        System.out.println("0. Exit");
    }

    public static int getUserInput() {
        System.out.println("Pls input number: ");
        Scanner scanner = new Scanner(System.in);
        int getUserInput = scanner.nextInt();
        return getUserInput;
    }

    private static void addNumberToArray(List<Integer> myArrayList) {
        System.out.print("Please enter the number of elements in an array : ");
        Scanner scanner = new Scanner(System.in);
        int Size = scanner.nextInt();
        for (int i = 0; i < Size; i++) {
            System.out.println("Pls input the number" + (i + 1) + " :");
            int number = scanner.nextInt();
            myArrayList.add(number);
        }
    }

    private static void printArray(List<Integer> myArrayList) {
        System.out.println("The Array List is: " + myArrayList);
    }

    private static void getMaxNumber(List<Integer> myArrayList) {
        int myArrLength = myArrayList.size();
        Set<Integer> set = new HashSet<>(myArrayList);
        int MaxValue = myArrayList.get(myArrLength - 1);
        System.out.println(MaxValue);
    }

    private static void getMinNumber(List<Integer> myArrayList) {
        int MinValue = myArrayList.get(0);
        System.out.println(MinValue);
    }

    private static void searchNumber(List<Integer> myArrayList) {
        System.out.println("Pls input the number to search: ");
        Scanner scanner = new Scanner(System.in);
        int numberSearch = scanner.nextInt();
        boolean foundNumber = false;
        for (int n : myArrayList) {
            if (n == numberSearch) {
                foundNumber = true;
                break;
            }
        }
        if (foundNumber)
            System.out.println("The number: " + numberSearch + " is found.");
        else
            System.out.println("The number: " + numberSearch + " is not found.");
    }
}

