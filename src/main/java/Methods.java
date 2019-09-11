import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[]bestarray = new int[]{2,3,4,5,6,7,8};
        System.out.println(sum(bestarray));
        int[]ascend = new int[]{3,9,1,8,4,8,5};
        sort(ascend);
        int[]smallest = new int[]{3,9,1,8,4,8,5};
        System.out.println(sort1(smallest));
        int[]ascend2 = new int[]{3,9,1,8,4,8,5};
        sortok(ascend2);
    }
    public static int sum(int[] sumarray){
        int summa=0;
        for (int member:sumarray) {
            summa +=member;
        }
        return summa;
    }
    public static void sort(int[] ascend){
        Arrays.sort(ascend);
        System.out.println(Arrays.toString(ascend));
    }
    public static int sort1(int[] smallest){
        int smallestmember=smallest[0];
        for (int i:smallest) {
            if (i<smallestmember){
                smallestmember=i;
            }
        }
        return smallestmember;
    }
    public static void sortok(int[] ascend) {
        int temp;
        for (int i = 0; i <ascend.length; i++) {
            for (int j = i + 1; j <ascend.length; j++) {
                if (ascend[i] > ascend[j]) {
                    temp = ascend[i];
                    ascend[i] = ascend[j];
                    ascend[j] = temp;
                }
            }
        }
        for (int i = 0; i <ascend.length; i++) {
            System.out.print(ascend[i] + ",");
        }
    }
}