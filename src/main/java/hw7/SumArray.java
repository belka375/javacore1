package hw7;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7, 8};
        int sum = sumArray(numbers);
        System.out.println(sum);
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int ar : arr) {
            sum += ar;
        }
        return sum;
    }
}
