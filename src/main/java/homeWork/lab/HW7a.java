package homeWork.lab;

public class HW7a {
        public static void main(String[] args) {
            System.out.println("task1: ");
            int[] num = new int[]{2,3,5,6,7,8};
            System.out.println(sum(num));
            System.out.println();
            System.out.println("task2: ");
            int[] num2 = new int[]{3,9,1,8,4,8,5};
            sort(num2);
            System.out.println();
            System.out.println("task3: ");
            int[] num3 = new int[]{3,9,1,8,4,8,5};


        }
        public static int sum(int[]numbers){
            int s = 0;
            for(int n: numbers){
                s = s + n;
            }
            return s;
        }
        public static void sort(int[]numbers){
            int temp = 0;
            for(int i = 0; i < numbers.length; i++) {
                for (int j =i+1; j < numbers.length; j++){
                    if (numbers[i] > numbers[j]) {
                        temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            for(int m=0; m <numbers.length; m++){
                System.out.println(numbers[m]);
            }
        }
        public static int getMinValue(int[]numbers){
            int t = numbers[0];
            for(int n:numbers){
                if(n<t){
                    t=n;
                }
            }
            return numbers[t];
        }
}


//    1. Создайте метод sum - который в качестве аргумента берет int[] и возвращает его сумму.
//            вызовите этот метод из функции main() - подайте в качестве параматра {2,3,5,6,7,8}
//
//            2. Создайте метод sort - который в качестве аргумента берет int[] и выводит на экран сортированную последовательность по возрастанию.
//            вызовите этот метод внутри функии main()
//            подайте в качестве параматра {3,9,1,8,4,8,5}
//
//            3. Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
//            (группа мак - макчимальное/ группа win - минимальное)
//            подайте в качестве параматра {3,9,1,8,4,8,5}

