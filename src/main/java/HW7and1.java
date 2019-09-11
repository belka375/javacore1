public class HW7and1 {
    public static void main(String [] args){
        int[] numbers = new int[]{2,3,5,6,7,8};

        sum(numbers);

    }

    private static void sum(int[] numbers) {
        int i=0;
        for(int number:numbers){
            i=i+number;

        }
        System.out.println(i);
    }
}
