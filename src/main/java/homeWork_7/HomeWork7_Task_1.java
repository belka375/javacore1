package homeWork_7;

public class HomeWork7_Task_1 {
    public static void main(String[] args) {

        //Task 1
        int[] myArray = {2, 3, 5, 6, 7, 8};
        printSumOfElements(myArray);
    }

    private static void printSumOfElements(int[] myArray) {
        int sumOfElements = 0;
        {
            for (int element : myArray) {
                sumOfElements = sumOfElements + element;
            }
            System.out.println("Sum of 'myArray' elements = " + sumOfElements);
        }
    }
}

