public class Methods {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        sumNumbrs(a, b);
        System.out.println("---------------");

        int sumNumber = sum(a, b);
        System.out.println(sumNumber);
        System.out.println("---------------");

        boolean numIsEven = isEven(a);
        System.out.println(numIsEven);
        
    }
    public static void sumNumbrs(int a, int b){
        System.out.println("a+b="+(a+b) );
    }
    public static int sum (int a, int b){
        return a+b;
    }
  public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else return false;
            }

}
