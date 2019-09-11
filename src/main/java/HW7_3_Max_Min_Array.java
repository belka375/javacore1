

/*
 * Homework 7.3-  Max and Min in Array
 *
 * 3.Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
 *(группа мак - макчимальное/ группа win - минимальное)
 *подайте в качестве параматра {3,9,1,8,4,8,5}
 */

import java.util.Arrays;
import java.util.Collections;



public class HW7_3_Max_Min_Array {

    public static void main(String[] args) {
        Integer arr[] = {3, 9, 1, 8, 4, 8, 5};

        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));
        System.out.println("Minimum number of given array is: " + min);
        System.out.println("Maximum number of given array is: " + max);



    }


}







