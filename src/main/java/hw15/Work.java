package hw15;

public class Work {
    public static void main(String[] args){
        Brick clayBrik = new Brick("Clay Brik", 7,3,2);
        clayBrik.getInfo();

        Brick concreteBrik = new Brick("Concrete Brik", 10, 5,5);
        concreteBrik.getInfo();

        MetalBeam b21015 = new MetalBeam("Beam B21015", 160,5,5, 150, 15.2 );
        b21015.getInfo();

        MetalBeam b1644 = new MetalBeam("Beam B1644", 60, 4, 2, 135, 0.282);
        b1644.getInfo();

    }
}
