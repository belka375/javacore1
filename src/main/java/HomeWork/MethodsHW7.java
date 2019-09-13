package HomeWork;

public class MethodsHW7 {
    public static void main(String[] args) {
        int[] sum = new int[]{2, 3, 5, 6, 7, 8};
        sum(sum);
        System.out.println("-------------------------------------------");
        int[] sort = new int[]{3, 9, 1, 8, 4, 8, 5};
        bubbleSort(sort);
        System.out.println("-------------------------------------------");
        int[] min = new int[]{3, 9, 1, 8, 4, 8, 5};


    }

    private static void sum(int[] number) {
        int sum = 0;
        for (int x : number) sum += x;
        System.out.println(sum);
    }


    private static void bubbleSort(int arr[]) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            int n = arr.length;
            for (int i = 0; i < n - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }

                }
            for (int i : arr) {
                System.out.println(arr[i]);
            }
        }
        }
    }





