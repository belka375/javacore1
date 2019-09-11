public class HW7 {

        public static void main (String[] args) {
        // task 1
        sum(new int[]{1, 2, 3, 4, 5, 6, 7});


        // task 3

        sort(new int[] {3,9,1,8,4,8,5});

        sort1(new int[] {3,9,1,8,4,8,5});


       // System.out.println( sum(new int[]{1, 2, 3, 4, 5, 6, 7}));

       // System.out.println(sort(new int[] {3,9,1,8,4,8,5}));

       // System.out.println(sort1(new int[] {3,9,1,8,4,8,5}));
    }

    private static int sum (int[] numbers){

       int summa = 0;

        for (int x : numbers) {
            summa += x;
        }
    return summa;
    }

    private static int sort (int[] numbers1) {

        int max = numbers1[0];


        for (int i = 0; i<numbers1.length; i++) {


            if (numbers1[i] > max) {
                max = numbers1[i];
            }
        }

        return max;
    }

    public static int sort1 (int[] numbers2) {

        int min = numbers2[0];
        for (int i=0; i<numbers2.length; i++) {

            if (numbers2[i]< min) {
                min = numbers2[i];
            }
        }
        return min;
    }

    }


