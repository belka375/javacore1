public class NomeWork7 {
    public static void main(String[]args){
        int numb[]={2,3,5,6,7,8};
        System.out.println("Sum of numbers is "+getSum(numb));
    }
     private static int getSum(int[] numbList) {
        int sum=0;
        for (int numb:numbList) {
            sum +=numb;
        }
        return sum;
    }
}
