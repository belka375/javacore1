package hw11;

public class Classes {
    public static void main(String[] args) {
        YogaClasses class1 = YogaClasses.VINYASA;
        YogaClasses class2 = YogaClasses.ASHTANGA;
        YogaClasses class3 = YogaClasses.HATHA;
        Days day1 = Days.MONDAY;

        System.out.println("Classes on " + day1 + ": ");
        System.out.println(class1 + ", " + class2 + ", " + class3 + ".");
        System.out.println();

        printDay(Days.TUESDAY);
        printClass(YogaClasses.IYENGAR);
    }

    public static void printDay(Days d){
        System.out.println("Classes on " + d + ": ");
    }

    public static void printClass(YogaClasses c) {
        System.out.println(c);
    }
}
