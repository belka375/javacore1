package lesson16;

public class Square extends Rectangle {
    public Square(double wide) {
        super(wide, wide);
    }

    @Override
    public double getSquare() {
//        return getWide()*getWide();
        return super.getSquare();
    }
}
