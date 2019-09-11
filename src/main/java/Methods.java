public class Methods {
    public static void main(String[] args) {

    int[] chisla=new int[]{2,3,5,6,7,8};

        System.out.println("The sum of numbers in array is: "+sum(chisla));

    int[] chisla2=new int[]{3,9,1,8,4,8,5};

        System.out.println("The minimum number in array is: "+minMethod(chisla2));

    }

    public static int sum(int numbers[]){
        int summa =0;
        for (int i=0; i<numbers.length; i++){
            summa=summa+ numbers[i];
        }
        return summa;
    }

    public static int minMethod(int numbers2[]) {
        int min = numbers2[0];
        for (int numbers : numbers2) {
            if (numbers < min) {
                min = numbers;
            }
        }
        return min;
    }

    }


