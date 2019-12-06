package rlesson7;

public class Methods {

    public static void main(String[]arg){

        int[]numbers =new int[]{1, 5,8,12,34,87};

        printEven(numbers);
    }

    private static void printEven(int[] numbers) {
for(int n:numbers){
    if(n%2==1){
        System.out.println(n);
    }
}
    }
}
