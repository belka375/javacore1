package homeWork12;

public class Work {

    public static void main(String[] args) {

        String[] memory= new String[]{"32 GB RAM, ", "1TB PCIe SSD, ", "Graphics Card Ram-6GB" };
        SystemBlock sysB=new SystemBlock(Brand.ASUS, Color.BLACK, "Intel Core i9-9900K", memory );

        Monitor monitor = new Monitor(Brand.ASER, "N506GH", 28.5, Color.BLUE);

        String[] language = new String[]{"English", "/", "Russian"};
        Keyboard keyBoard = new Keyboard(Color.SILVER, "yes", language, "yes", Brand.ASUS);

        Mouse mouse = new Mouse(Brand.DELL, Color.BLACK, ConnectionType.WIRELESS);

        Computer asus=new Computer(sysB, monitor, keyBoard,mouse);
        asus.printComputer();


    }
}
