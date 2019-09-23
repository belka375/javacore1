package homework12_13_14;

import java.time.LocalDate;

public class HomeWork {
    public static void main(String[] args) {
        Keyboard k1 = new Keyboard(Make.MICROSOFT, "Surface", LocalDate.of(2018,12,12), true, Color.GRAY);
        Keyboard k2 = new Keyboard(Make.HP, "Razor",LocalDate.of(2018,8,17), true, Color.GRAY);
        Keyboard k3 = new Keyboard(Make.LENOVO, "Yoga", LocalDate.of(2017,6,15), false, Color.BLACK);

        Mouse m1 = new Mouse(Make.MICROSOFT, "Surface", LocalDate.of(2018,12,15), Color.GRAY, true);
        Mouse m2 = new Mouse(Make.HP, "Razor", LocalDate.of(2018,8,15), Color.GREEN, false);
        Mouse m3 = new Mouse(Make.LENOVO, "Yoga", LocalDate.of(2017,06,16), Color.GRAY, true);

        Monitor mo1 = new Monitor(Make.DELL, "D156", Color.GRAY, LocalDate.of(2018,12,15), 32, ScreenType.FULL_HD);
        Monitor mo2 = new Monitor(Make.ASUS, "A78", Color.BLACK, LocalDate.of(2018, 6,7), 25.5, ScreenType.LED);
        Monitor mo3 = new Monitor(Make.HP, "HP360", Color.WHITE, LocalDate.of(2017,10,15), 25.5, ScreenType.FULL_HD_4K);

        SystemBlock sb1 = new SystemBlock(Make.LENOVO, "L123",  LocalDate.of(2018,12,6), Color.WHITE,  16, 512,"Intel", "NVIDIA", OperatingSystem.WINDOWS);
        SystemBlock sb2 = new SystemBlock(Make.APPLE, "12", LocalDate.of(2018, 12,9), Color.GRAY, 16,512, "Apple", "Integrated", OperatingSystem.APPLE );
        SystemBlock sb3 = new SystemBlock(Make.HP, "HP450", LocalDate.of(2018,12,15), Color.RED, 16, 1, "Intel", "NVIDIA", OperatingSystem.WINDOWS);

        Computer computer1 = new Computer(k1, mo1, m1, sb1);
        Computer computer2 = new Computer(k2, mo2, m2, sb2);
        Computer computer3 = new Computer(k3, mo3, m3, sb3);

        Computer[] set1 = new Computer[]{computer1, computer2};
        Computer[] set2 = new Computer[]{computer2, computer3};
        Computer[] set3 = new Computer[]{computer1, computer3};

        Company sku = new Company("Skuvault", LocalDate.of(2006, 12,06), true, computer1);
        Company hu = new Company("Humana", LocalDate.of(1998, 06,06), false, computer2);

        String cn = sku.getName();
        System.out.println(cn);

        Make cComputerMake = sku.getComputers().getMon().getMake();
        String cComputerModel = sku.getComputers().getMon().getModel();

        System.out.println(cComputerMake);
        System.out.println(cComputerModel);







    }
}
