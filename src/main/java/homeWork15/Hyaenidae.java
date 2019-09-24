package homeWork15;

public class Hyaenidae extends CaniformiaFeliformia {

    public Hyaenidae(String nameClass, String name, String reproduction, int legs) {
        super(nameClass, name, reproduction, legs);
    }

    @Override
    public void eatPrey() {
        System.out.println("Гиеновые -  семейство хищных млекопитающих подотряда кошкообразных (Feliformia).");

    }

    @Override
    public void hunter() {
        System.out.println("Many hunt in packs and are social animals, giving them an advantage over larger prey");

    }
}
