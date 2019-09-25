package homeWork15;

public class Work {

    public static void main(String[] args) {

        Print gt5=new Asus("Asus GT5", "Windows 10", "Intel Core i9");
        Print rog=new Asus("ROG Strix","Windows 10","Intel Core i9");
        Print ins=new Dell("Dell Inspiron 15", "Windows 8.1", "\"Intel Core i5");
        Print acer=new PC("Premium ACER Inspiron 17.3", "Windows 10", "AMD Ryzen 5 2500U");
        Print huawei=new PC("Huawei MateBook X Pro","Windows 10", "Intel Core i7");

        gt5.printWelcome();
        printPC(gt5);
        printPC(rog);

        ins.printMore();
        printPC(ins);
        printPC(acer);
        printPC(huawei);

    }
    private static void printPC(Print pc) {
        pc.printInfo();

    }
}
