package lesson7;

public class MyLesson7 {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 7, 8};
        System.out.println("Sum of all elements is " + findSum(a));

        int[] sort = {3, 9, 1, 8, 4, 8, 5};
        sortArrayByAsc(sort);

        int[] sort1 = new int []{3, 9, 1, 8, 4, 8, 5};
        System.out.println("Max for Mac students is " +maxArrayElement(sort1));

    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    private static void sortArrayByAsc(int[] sort) {
        int temp;
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        for (int asc : sort) {
            System.out.println(asc);
        }
    }

    public static int maxArrayElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;


    }
}