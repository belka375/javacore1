public class Method1 {
    public static void main(String[] args){

        int[] numbers = new int[]{4,6,7,8,9,0,3};
        int[] temperatur = new int[]{122,145,123,147,456,45};
        int [] age = new int []{12,11,45,12,13,47};

        functEvenNumbers(numbers);
        System.out.println("---------------");
        functEvenNumbers(temperatur);
        System.out.println("---------------");
        functEvenNumbers(age);
    }

    private static void functEvenNumbers(int[] n) {
        for (int numb:n){
            if(numb%2==0){
                System.out.println(numb);
            }
        }
    }
}
