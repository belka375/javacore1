package lesson16;

public class Square extends Rectangle {
    public Square(double wide) {
        super(wide, wide);
    }


    @Override
    public void setWide(double wide) {
        super.setWide(wide);
    }

    @Override
    public double getWide() {
        return super.getWide();
    }

    @Override
    public double getSquare() {
        return getWide()*getWide();
    }

    @Override
    public void printInfo() {
       System.out.println(getSquare());
    }
}
