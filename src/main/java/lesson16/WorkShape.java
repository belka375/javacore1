package lesson16;

public class WorkShape {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(25,16);
        Square square = new Square(25);
        Circle circle = new Circle(4);

        Shape[] shapes = new Shape[]{rec,square,circle};
        for(Shape x:shapes){
            System.out.println(x.getSquare());
        }

        rec.printInfo();
        square.printInfo();
        circle.printInfo();

    }
}
