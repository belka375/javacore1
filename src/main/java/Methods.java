public class Methods {
//Homework6
    public static void main(String[] args) {
        System.out.println("-#1----------------------------------------");

        printSum(64,78);
        System.out.println("-#2----------------------------------------");
        System.out.println(printSumm(54,98));
        System.out.println("-#3----------------------------------------");
        System.out.println(isEven(18));
        System.out.println(isEven(15));

    }
    private static void printSum(int a, int b){
        int x;
        x=a+b;
        System.out.println(x);
    }
    private static int printSumm(int c, int z){
        int b;
         b=c+z;
         return b;
    }
    private static boolean isEven(int d){
        if (d%2==0){
            return true;
        }return false;
    }
}


