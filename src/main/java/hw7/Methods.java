package hw7;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
//        1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
//
//                вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}
//
//        2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
//
//                вызовите этот метод внутри функии main()
//
//        подайте в качестве параматра {3,9,1,8,4,8,5}
//
//        3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
//
//        (группа мак - макчимальное/ группа win - минимальное)
//
//        подайте в качестве параматра {3,9,1,8,4,8,5}

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
