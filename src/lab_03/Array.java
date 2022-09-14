package lab_03;

public class Array {
    public static void main(String[] args) {
        final int ARR_LENGTH = 5;
        int [] myIntArr= new int [ARR_LENGTH];
        for (int index = 0; index < myIntArr.length; index++) {
           myIntArr[index] = index;
        }
        System.out.println();
        for (int index = ARR_LENGTH; index > 0; index--) {
            System.out.println(myIntArr[index]);
        }

    }
}
