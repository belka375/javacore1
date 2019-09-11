
    public class HW7_2_BubbleSort_Array {


        public static void main(String[] args) {
            int arr3[] = { 3, 9, 1, 8, 4 , 8, 5 };

            bubbleSort(arr3);
            System.out.println("Array After Sort");

            for (int i = 0; i < arr3.length; i++)
            {
                System.out.print(arr3[i] + " ");
            }
        }


        static void bubbleSort(int[] barr) {
            int n = barr.length;
            int temp = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j=1; j < (n-i); j++)
                {
                    if(barr[j-1] > barr[j])
                    {
                        temp = barr[j-1];

                        barr[j-1] = barr[j];

                        barr[j] = temp;
                    }
                }
            }









        }







    }
