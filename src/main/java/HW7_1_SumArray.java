/*
 * Homework 7 .1- Array Search
 *
 * 1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
 * вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}

 */



public class HW7_1_SumArray {

    public static void main(String[] args) {
        int num[] = {2, 3, 5, 6, 7, 8};
        System.out.println("Sum of given array is: " + getSum(num));

    }

    static int getSum(int[] numberList) {
        int sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            sum += numberList[i];}

        return sum;

    }






}
