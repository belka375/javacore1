package lesson16;

public class Square extends Rectangle{
    public Square(double wide) {
        super(wide,high);
    }

    @Override
    public double getSquare() {
       // return getWide()*getWide();
        return super.getSquare();
    }
}
