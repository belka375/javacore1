package homeWork.lab;

public class HomeWork7 {



    public static void main(String[] args) {

        int[] suma = new int[]{2, 3, 5, 6, 7, 8};
        System.out.println("The sum of numbers = " + sum(suma));

        int[] Array1 = new int[]{3, 9, 1, 8, 4, 8, 5};
        sort(Array1);



    }


//    1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
//   вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}

    public static int sum(int[] array) {
        int x = 0;
        for (int y : array) {
            x = x + y;
        }
        return x;
    }


//2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
//   вызовите этот метод внутри функии main()
//   подайте в качестве параматра {3,9,1,8,4,8,5}

    private static void sort(int[] Array2) {
        for (int i = 0; i < Array2.length; i++) {
            for (int j = 0; j < Array2.length; j++) {
                if (Array2[i] < Array2[j]) {
                    int y = Array2[i];
                    Array2[i] = Array2[j];
                    Array2[j] = y;
                }
            }
        }
        System.out.println("Arrange numbers in order:");

        for (int Array : Array2) {
            System.out.println(Array + " ");

        }
    }

//3. Создайте метод, который в качестве аргумента берет int[] и возвращает/минимальное значение
//    подайте в качестве параматра {3,9,1,8,4,8,5}


    public static int getMinValue(int[]array) {
        int[] numbers = new int[]{3, 9, 1, 8, 4, 8, 5};

        int smallest = numbers[0];
        for (int element : numbers) {
            if (element < smallest) smallest = element;
        }
        return array[smallest];
//            System.out.println("The smallest numaber:" + smallest);
        }


}