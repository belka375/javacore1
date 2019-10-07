package homeWork20.animals.Vertebrates.Mammals.Carnivores;

public class Wolf extends Carnivores {


    public Wolf(String name, int lifespan, int mass, int gestation, double length) {
        super(name, lifespan, mass, gestation, length);


    }

    @Override
    public void fatOfMilk() {
        System.out.println("После 62—65 дней беременности самки приносят от 3 до 13 слепых волчат, прозревающих на 12—13 день." +
                " \nПервое время волчата сосут молоко, подросших[уточнить] волчат родители кормят отрыжкой из съеденного мяса," +
                " \nпозже — убитой добычей. В выкармливании волчат принимает участие вся стая.");

    }
    @Override
    public void description() {

        System.out.println("The wolf is monogamous, with mated pairs usually remaining together for life."+ " Its mass = "+ getMass() + "lbs ;Length = "+ getLength()+" feet" );
    }
    @Override
    public void comprising() {
    System.out.println("Исследования митохондриальной ДНК показали, что существует по меньшей мере 4 генеалогических линии волка," +
            "\nсамой древней из которых является линия африканского, " +
            "\nпоявившегося в середине позднего плейстоцена. Остальные линии относятся к Индийскому субконтиненту. Lifespan => "+ getLifespan());

    }
    @Override
    public void breeding() {
            System.out.println(getName() + " => Gestation period in month: " + getGestation());
    }
    @Override
    public void food() {
        System.out.println("Умственно волк высоко развит. Это выражается в умении ориентироваться в обстановке и уходить от опасности, а также в способах охоты. \nВысоко развито искусство применения стайных коллективных действий." +
                " \nИзвестны случаи, когда стая волков разделялась, и одна часть оставалась в засаде, а другая нагоняла на неё добычу." +
                " \nВ стае, преследующей лося или оленя, часто одни волки бегут по пятам жертвы, \nа другие — наперерез или трусят не спеша и, отдохнув, сменяют передовых, пока не возьмут жертву измором.  Волки, особенно в южных районах," +
                " \nпоедают и растительные корма — разные ягоды, дикие и садовые фрукты, даже грибы. \nВ степях они часто делают набеги на бахчи арбузов и дынь," +
                " \nудовлетворяя не столько голод, сколько жажду, поскольку нуждаются в регулярном, обильном водопое.");
    }
}
