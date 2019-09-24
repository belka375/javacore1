package homeWork15;

public class Mephitidae extends CaniformiaFeliformia {
    public Mephitidae(String nameClass, String name, String reproduction, int legs) {
        super(nameClass, name, reproduction, legs);
    }

    @Override
    public void eatPrey() {
        System.out.println("Скунсы -  семейство млекопитающих из отряда хищных. \nДо недавнего времени скунсов относили к семейству куньих , " +
                "\nоднако молекулярные исследования дали основания выделить их в отдельное семейство, возможно, " +
                "\nближе к пандовым, чем к куньим и енотовым");

    }

    @Override
    public void hunter() {
        System.out.println("The polar bear subsists mainly on seals.");

    }
}
