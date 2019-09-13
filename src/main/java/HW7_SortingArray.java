public class HW7_SortingArray {
    public static void main(String[]args) {

        //task 2
        int[] arrays = new int[]{3, 9, 1, 8, 4, 8, 5};

        int count;
        do {
            count = 0;
            for (int i = 0; i < arrays.length - 1; i++) {
                if (arrays[i] > arrays[i + 1]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = temp;
                    count++;
                }
            }


        }
        while (count > 0);
        for (int number : arrays) {
            System.out.println(number);

        }
    }

}
