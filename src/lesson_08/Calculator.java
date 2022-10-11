package lesson_08;

public class Calculator {
    public int sum(int num1, int num2){
        return  num1+num2;
    }
    public int sum(int num1, int num2, int num3){
        return  num1+num2+num3;
    }
    public int sum(int... nums){
        int total =0;
        for (int num : nums) {
            //total = total +num;
            total += num;
        }
        return  total;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3));
    }
}
