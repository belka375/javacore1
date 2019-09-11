public class Methods {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,6,7,8};
        int[] numbers1 = {3,9,1,8,4,8,5};

        arSumma(numbers);
        sorting(numbers1);
    }


    public static int arSumma(int[] numbers){
        int sum = 0;
        for (int num1 : numbers){
            sum = sum + num1;
        }
        return sum;
    }
    private static void sorting(int[] numbers1) {
        for (int i = 0; i < numbers1.length; i++) {
            for (int k = 0; k < numbers1.length; k++) {
                if (numbers1[i] < numbers1[k]) {
                    int y = numbers1[k];
                    numbers1[i] = numbers1[k];
                    numbers1[k] = y;
                }
            }
        }
    }
}
