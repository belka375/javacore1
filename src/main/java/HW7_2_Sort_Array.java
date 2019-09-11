/*
    * Homework 7.3-  Max and Min in Array
    * 2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
    *вызовите этот метод внутри функии main()
    *подайте в качестве параматра {3,9,1,8,4,8,5}
*/

import java.util.Arrays;

public class HW7_2_Sort_Array {

    public static void main(String[] args) {
        Integer arr1[] = {3, 9, 1, 8, 4, 8, 5};

        Arrays.sort(arr1);

        System.out.println("Sorted array presented: " + Arrays.toString(arr1));
    }

}






