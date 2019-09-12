public class Methods {
    public static void main(String[] args) {

       System.out.println("*************");
//
//        Car mashina = new Car();
//        mashina.beep();
////        int[] ma = new int[10];
////        int x=5;
//
//        Car ivanCar=new Car();
//        ivanCar.brand="BMW";
//        ivanCar.model="XS";
//        ivanCar.color="Pink";
//        ivanCar.gasTankVolume=18.5;
//
//        ivanCar.lightOn();
////        System.out.println("color of "+ivanCar.model+" is "+ivanCar.color);
//        ivanCar.printCarInfo();
//
//        Car janeCar = new Car();
//        janeCar.color = "Silver";
//        janeCar.brand = "Audi";
//        janeCar.model = "A2";
//        janeCar.gasTankVolume = 15;
//
//        janeCar.printCarInfo();
//

//        int[] numbers = {2, 3, 5, 6, 7, 8};
//        sumArray(numbers);
//        int[] numbers1 = {3, 9, 1, 8, 4, 8, 5};
//        sort(numbers1);
//        System.out.println(max(numbers1));

Person mailman = new Person();
mailman.name = "John";
mailman.lastName ="Dole";
mailman.eyeColor = "Blue";
mailman.weight = 180;
mailman.age = 45;
mailman.hasChildren = true;

mailman.printFullName();
mailman.printPhysicalConditions();

    }

//    public static int sumArray(int[] arr) {
//        int sum = 0;
//        for (int ar : arr) {
//            sum = sum + ar;
//        }
//        return sum;
//    }

//    private static void sort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    int x = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = x;
//                }
//            }
//
//        }
//
//        System.out.println("Ascending Order:");
//        for (int ar:arr) {
//            System.out.print(ar + " ");
//        }
//    }

//private static int max(int[] arr){
//        int max=arr[0];
//    for (int ar:arr) {
//        if (max<ar){
//           max=ar;
//        }
//    }
//        return max;
//}

}
