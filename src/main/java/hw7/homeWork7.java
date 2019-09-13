package hw7;

public class homeWork7 {
    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 5, 6, 7, 8};

        System.out.println("Sum of numbers in array is equal to " + sumMethod(array));

        int[] numbers = new int[]{3,9,1,8,4,8,5};
        sort(numbers);
        for (int i = 0; i < numbers.length; i++){
        System.out.println(numbers[i]+"");}

        int[] arrays = new int[]{3, 9, 1, 8, 4, 8, 5};
        System.out.println("Min number is equal to " +minNum(arrays));

    }



    private static int sumMethod(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;


    }

    private static int[] sort(int[] list) {
        int i, j, temp;
        for (i = 0; i < list.length - 1; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }

    public static int minNum(int[] arrays) {
        int min = arrays[0];
        for (int x : arrays)
        {
            int z = 0;
            if (x < min)
            {
                min = x;


                z++;

            }

        }
        return min;
    }
}










