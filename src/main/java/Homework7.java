import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{2,3,5,6,7,8};
        System.out.println(getSum(numbers1));

        int[] numbers2 = new int[] {3,9,1,8,4,8,5};
        Arrays.sort(numbers2);
        System.out.printf(Arrays.toString(numbers2));
        System.out.println();
        System.out.println(getSort(numbers2));
    }

    private static int getSort(int[] numbers2) {
        int max = numbers2[0];
        for (int n = 0; n< numbers2.length; n++) {
            if (numbers2[n] >= max ) {
            max = numbers2[n];
        }  n++;
        } return max;
    }

    private static int getSum(int[] numbers1) {
        int sum =0;
        for (int n:numbers1
             ) { sum += n;
        } return sum;
    }

}
