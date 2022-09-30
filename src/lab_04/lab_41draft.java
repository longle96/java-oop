//package lab_04;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class lab_41draft {
//    public static void main(String[] args) {
//        List<Integer> myArrayList = new ArrayList<>();
//        boolean isContinuing = true;
//        while (isContinuing) {
//            printMenuGame();
//            int option = getUserInput();
//            switch (option) {
//                case 0:
//                    System.out.println("Goodbye");
//                    isContinuing = false;
//                    break;
//                case 1:
//                    addNumberToArray();
//                    break;
//                case 2:
//                    printArray();
//                    break;
//                case 3:
//                    getMaxNumber();
//                    break;
//                case 4:
//                    getMinNumber();
//                    break;
//                case 5:
//                    searchNumber();
//                default:
//                    System.out.println("Pls input another number!!!");
//            }
//        }
//    }
//
//    private static void printMenuGame() {
//        System.out.println("====Game menu===");
//        System.out.println("1. Generate: ");
//        System.out.println("2. Print");
//        System.out.println("3. Max: ");
//        System.out.println("4. Min: ");
//        System.out.println("5. Search number: ");
//        System.out.println("0. Exit");
//        System.out.println("Pls input number: ");
//    }
//    private static void getUserInput(List<Integer> myArrayList) {
//
//    }
//    private static void addNumberToArray() {
//
//    }
//    private static void printArray(List<Integer> myArrayList) {
//            System.out.println(array);
//    }
//    private static void getMaxNumber(List<Integer> myArrayList) {
//        for (int i = 0; i < Size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        for (int i = 0; i < Size; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println(max + " is the maximum number");
//    }
//    private static void getMinNumber(List<Integer> myArrayList) {
//        for (int i = 0; i < Size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int min = array[0];
//        for (int i = 0; i < Size; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println(min + " is the minimum number");
//    }
//    private static void searchNumber() {
//        }
//
//
//    private static void getUserInput() {
//    }