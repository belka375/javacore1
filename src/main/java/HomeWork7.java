public class HomeWork7 {
    public static void main(String[] args) {

        int[] sum = {2, 3, 5, 6, 7, 8};
        int[] sort = {3,9,1,8,4,8,5};
        int[] numbers = {3,9,1,8,4,8,5};
        int[] numbers2 = {3,9,1,8,4,8,5};

        System.out.println( getSum(sum));
        System.out.println("__________________________________");

        sortingNumbers(sort);
        System.out.println("__________________________________");

        getMax(numbers);
        System.out.println("__________________________________");
        getMin(numbers2);

    }
    private static int getSum(int[] numberList) {
        int summma = 0;
        for (int i = 0; i < numberList.length; i++) {
            summma += numberList[i];
        }
        return summma;
    }
    private static void sortingNumbers(int[] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    private static void getMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
    private static void getMin(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}

