public class Lesson6 {
    public static void main(String[] args) {
        sayHi();

        double sphere1 = getSphereVolume(15.5);
        double sphere2 = getSphereVolume(45.6);

        System.out.println("V1=" + sphere1 + "V2="+sphere2);

    }
    public static void sayHi(){
        System.out.print("Hi");
    }
    public static double getSphereVolume(double radius){
        return Math.PI*radius*radius*radius;

    }

    }