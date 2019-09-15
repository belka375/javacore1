public class HW7_1_SummArray {
    public static void main(String [] args){
        int[] numbers = new int[]{2,3,5,6,7,8};

        System.out.println(sum(numbers));

    }

    private static int sum(int[] numbers) {
        int i=0;
        for(int number:numbers){
            i+=number;

        }
        return i;
    }
}
