package homeWork.lab;

public class HW7b {

        public static void main(String[] args) {
            int[] numbers = {2, 3, 5, 6, 7, 8};
        sumArray(numbers);
            int[] numbers1 = {3, 9, 1, 8, 4, 8, 5};
            sort(numbers1);
        System.out.println(max(numbers1));


        }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int ar : arr) {
            sum = sum + ar;
        }
        return sum;
    }

        private static void sort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int x = arr[i];
                        arr[i] = arr[j];
                        arr[j] = x;
                    }
                }

            }

            System.out.println("Ascending Order:");
            for (int ar:arr) {
                System.out.print(ar + " ");
            }
        }

private static int max(int[] arr){
        int max=arr[0];
    for (int ar:arr) {
        if (max<ar){
           max=ar;
        }
    }
        return max;
}

    }

