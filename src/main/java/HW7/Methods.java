package HW7;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        int [] num= new int[]{2,3,5,6,7,8};
        printSum(num);
        int [] array= new int[]{3,9,1,8,4,8,5};
        printSort (array);
        int maxVal=sortMax(array);
        System.out.println("Return maximum num: " +maxVal);
        sortMin(array);
        System.out.println("Return minimum num: " +sortMin(array));

    }
    public static int sortMin (int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static int sortMax (int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }


    public static void printSort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("All elements of array sorted ascending sequence " +Arrays.toString(numbers));
    }

    private static void printSum(int[] ar) {
        int sum = 0;
        for (int i = 0; i <ar.length; i++){
            sum += ar[i];
        }
        System.out.println(sum);
    }

}
