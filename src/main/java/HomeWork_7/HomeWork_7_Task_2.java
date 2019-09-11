package HomeWork_7;

import java.util.Arrays;

public class HomeWork_7_Task_2 {
    public static void main(String[] args) {

        int[] sort = {3, 9, 1, 8, 4, 8, 5};
        sortArrayElementsAsc(sort);
    }

    private static void sortArrayElementsAsc(int[] sort) {
        Arrays.sort(sort);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }
}
