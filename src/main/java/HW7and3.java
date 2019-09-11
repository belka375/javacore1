public class HW7and3 {
    public static void main(String[] args){
        int[] numbers = new int[]{3,9,1,8,4,8,5};

        sort(numbers);

    }

    private static void sort(int[] numbers) {
        int i = -555555;

        for (int num : numbers) {
            if (i < num) {
                i = num;
            }

        }
        System.out.println(i);
    }

}
