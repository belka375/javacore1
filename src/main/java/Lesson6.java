public class Lesson6 {
    public static void main (String[]args){

        Lesson6 les6 = new Lesson6();
        les6.sum(3,6);

        int result =les6.sum1(3,6);
        System.out.println(result);

        boolean result2 = les6.isEven(6);
        System.out.println(result2);
    }
    public void sum (int a, int b){
        int c = a +b;
        System.out.println("Sum: " + c);
    }
    public int sum1(int a, int b){
        int c = a + b;
        return c;
    }
    public boolean isEven(int a){
        return a %2==0;
    }



    }