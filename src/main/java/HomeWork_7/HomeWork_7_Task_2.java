package HomeWork_7;

public class HomeWork_7_Task_2 {
    public static void main(String[] args) {

        int[] sort = {3, 9, 1, 8, 4, 8, 5};
        sortArrayElementsAsc(sort);
        System.out.println("---------");
        sortArrayElementsDesc(sort);
    }

    //Sort DESC order
    private static void sortArrayElementsDesc(int[] sort) {
        int temp;
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - 1; j++) {
                if (sort[j] < sort[j + 1]) {
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        for (int desc : sort) {
            System.out.println(desc);
            {
            }
        }
    }

    // Sort ASC order
    private static void sortArrayElementsAsc(int[] sort) {
        int temporary;
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    temporary = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temporary;
                }
            }
        }
        for (int asc : sort) {
            System.out.println(asc);
        }
    }
}


//import java.util.Arrays;
//
//public class HomeWork_7_Task_2 {
//    public static void main(String[] args) {
//
//        int[] sort = {3, 9, 1, 8, 4, 8, 5};
//        sortArrayElementsAsc(sort);
//    }
//
//    private static void sortArrayElementsAsc(int[] sort) {
//        Arrays.sort(sort);
//        for (int i = 0; i < sort.length; i++) {
//            System.out.println(sort[i]);
//        }
//    }
//}
