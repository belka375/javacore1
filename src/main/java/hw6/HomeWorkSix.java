package hw6;

//      Создайте функцию public static void main(String[]args){}
//      Делайте послеующие задания внутри тела функции main()

//   1. Создайте метод sum - который в качестве аргумента берет 2 целых числа и печатает их результат на экране.
//      вызовите этот метод из функции main() (подсказка - тип функции будет void)


    public class HomeWorkSix {
        public static void main(String[]args) {

            int a = 10;
            int b = 57;


            System.out.println();
            System.out.println();
            //  1.
            sum(a, b);

            //  2.
            System.out.println("Sum of two numbers is: " + sumOfTwo(a,b));

            //  3.
            boolean bul = isEven(a);
            System.out.print("Is variable a = 10 Even? ");
            System.out.println(bul);
        }

        private static void sum(int a, int b){
            System.out.println( a + b );
        }

//    2. Создайте метод sum - который в качестве аргумента берет 2 целых числа и возвращает их сумму.
//       Bызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран
//       (подсказка - тип функции будет int)


        private static int sumOfTwo(int x, int y) {
           return x + y;
        }


//    3. Создайте метод isEven - который в качестве аргумента берет целое число и если оно четное возвращает true
//       если нечетное - возвращает false
//       вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран

        private static boolean isEven(int a){
            if (a % 2 == 0){
                return true;
            }
            else{
                return false;
            }
        }

}

