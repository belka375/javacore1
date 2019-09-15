public class HW7_3_MaxElementArray {
    public static void main(String[] args){
        int[] numbers = new int[]{3,9,1,8,4,8,5};

        System.out.println(max(numbers));

    }

    private static int max(int[] numbers) {
        int i = -555555;

        for (int num : numbers) {
            if (i < num) {
                i = num;
            }

        }
        return i;
    }


}
