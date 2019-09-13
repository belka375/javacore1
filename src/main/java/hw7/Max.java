package hw7;

public class Max {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 1, 8, 4, 8, 5};
        System.out.println(max(numbers));
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int ar : arr) {
            if (ar > max)
                max = ar;
        }
        return max;
    }
}
