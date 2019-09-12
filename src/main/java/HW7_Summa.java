public class HW7_Summa {
    public static void main(String[]args) {
        // task 1
        int[] numbers = new int[]{2, 3, 5, 6, 7, 8};
        System.out.println(sum(numbers));

    }

    //task 1
    private static int sum(int[] numbers) {
        int total=0;
        for (int  number:numbers) {
            total +=number;

        }
        return total;
    }



}
