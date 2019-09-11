package HomeWork_7;//package HomeWork_7;
//
//public class HomeWork_7_Task_2 {
//    public static void main(String[] args) {

//        int[] sort = {3, 9, 1, 8, 4, 8, 5};
//        System.out.println(sortedArrayElementsAsc(sort));
//
//    }
//
//    private static int[] sortedArrayElementsAsc(int[] nonSortedArray) {
//        int[] sortedArray = new int[nonSortedArray.length];
//        int temp;
//        for (int j = 0; j < nonSortedArray.length - 1; j++) {
//            for (int i = 0; i < nonSortedArray.length - 1; i++) {
//                if (nonSortedArray[i] > nonSortedArray[i + 1]) {
//                    temp = nonSortedArray[i];
//                    nonSortedArray[i] = nonSortedArray[i + 1];
//                    nonSortedArray[i + 1] = temp;
//                    sortedArray = nonSortedArray;
//                }
//            }
//
//        }
//        return sortedArray;
//    }
//}
