package rhw6;

public class Work {

    public static void main (String[]args) {
        sum(15, 25);

        int a = sum1(12, 15);
        System.out.println(a);

        isEven(15);

        String[] colors = new String[]{"Red", "Black", "Blue", "Yellow", "Orange"};
        String[] cars =new String[]{"BMW", "Lada", "Audi", "Lexus"};

        getColor(colors);
        getColor(cars);

    }


    public static void sum(int a, int b){
    System.out.println(a+b);

}

public static int sum1(int c, int d){
        return c+d;
}

public static void isEven(int a){

        if (a%2==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }


    public static void getColor(String[] colors) {
        for(String c:colors){
            if(c.length()==4){
                System.out.println(c);



    }}}}

