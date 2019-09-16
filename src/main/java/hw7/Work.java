package hw7;

public class Work {
    public static void main(String[] args) {

        int[] num = {2, 3, 5, 6, 7, 8};
        int[] sort = {3,9,1,8,4,8,5};
        int[] nums = {3,9,1,8,4,8,5};
        System.out.println("1. Create method sum - which will have as argument away of integers (int[]) and will print sum all elements of this array.\n" +
                "Call this method from main() function - give as parameters {2,3,5,6,7,8}");
        System.out.println("Sum is " + getSum(num));
        System.out.println("2. Create method sort - which will have as argument away of integers (int[]) and will print all elements of array sorted ascending sequence.\n" +
                "Call this method from main() function - give as parameters {3,9,1,8,4,8,5}");
        sortingNumbers(sort);
        System.out.println("3. Create method sort - which will have as argument away of integers (int[]) and return maximum / minimum element of array \n" +
                "(For team MAC - maximum / team win - minimum) give as parameters {3,9,1,8,4,8,5}");
        maxNumbers(nums);
    }
    private static int getSum(int[] numberList) {
        int sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            sum += numberList[i];
        }
        return sum;
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
    private static void maxNumbers(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
