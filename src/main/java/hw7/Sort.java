package hw7;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 1, 8, 4, 8, 5};
        sort(numbers);
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }

        System.out.println("Numbers of array in ascending order:");
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }
}

