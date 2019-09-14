package homeWork_7;

public class HomeWork7_Task_3 {
    public static void main(String[] args) {

        //Task 3 (using 'foreach')
        int[] myArray3 = {3, 9, 1, 8, 4, 8, 5};
        maxNumberOfArray(myArray3);
        minNumberOfArray(myArray3);

    }

    private static void minNumberOfArray(int[] myArray3) {
        for (int min : myArray3) ;
        int number = myArray3[0];
        for (int i = 0; i < myArray3.length; i++) {
            if (number > myArray3[i])
                number = myArray3[i];
        }
        System.out.println("Smallest element from 'myArray3' = " + number);

    }

    private static void maxNumberOfArray(int[] myArray3) {
        for (int max : myArray3) ;
        int number = myArray3[0];
        for (int i = 0; i < myArray3.length; i++) {
            if (number < myArray3[i])
                number = myArray3[i];
        }
        System.out.println("Biggest element from 'myArray3' = " + number);
    }
}


//Task 3 (using 'for')
//    private static void minNumberOfArray(int[] myArray3) {
//        for (int i = 0; i < myArray3.length; i++) ;
//        int min = myArray3 [0] ;
//        for (int i = 0; i<myArray3.length; i++){
//            if (min > myArray3[i])
//                min = myArray3[i];
//        }
//        System.out.println("Smallest element from 'myArray3' = " +min);
//    }
//
//    private static void maxNumberOfArray1(int[] myArray3) {
//        for (int i = 0; i < myArray3.length; i++) ;
//        int max = myArray3[0];
//        for (int i = 0; i < myArray3.length; i++) {
//            if (max < myArray3[i])
//                max = myArray3[i];
//        }
//        System.out.println("Biggest element from 'myArray3' = " +max);
//    }
// }
//}
