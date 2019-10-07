package homeWork20.animals.Vertebrates.Mammals.Carnivores;

public class Lion extends Carnivores {
    public Lion(String name, int lifespan, int mass, int gestation, double length) {
        super(name, lifespan, mass, gestation, length);
    }

    @Override
    public void fatOfMilk() {
   System.out.println("Лактация длится 6—7 месяцев; "+getName()+"; Lifespan in Years => "+getLifespan()+"; Mass in kg => "+getMass()+"; Gestation in days => "+getGestation()+"; Length in sm => "+getLength());
    }

    @Override
    public void description() {
        System.out.println(getName()+"; Lifespan in Years => "+getLifespan()+"; Mass in kg => "+getMass()+"; Gestation in days => "+getGestation()+"; Length in sm => "+getLength());
    }

    @Override
    public void comprising() {
        System.out.println(getName()+"; Lifespan in Years => "+getLifespan()+"; Mass in kg => "+getMass()+"; Gestation in days => "+getGestation()+"; Length in sm => "+getLength());
    }

    @Override
    public void breeding() {
        System.out.println("Большинство львиц способно к размножению с четырёх лет." +
                " Самцы начинают спаривание с момента наступления проэструса у самок." +
                " \nКак и у других кошек, на пенисе льва расположены шипы, которые направлены в обратную сторону по направлению его движения." +
                " \nПри выводе пениса эти шипы задевают стенки влагалища самки, что вызывает овуляцию. Львица может спариваться сразу с несколькими самцами," +
                " если у неё наступает овуляция. \nВо время периода случки, который может длиться до нескольких дней, пара совокупляется от 20 до 40 раз в день и, " +
                "как правило, отказывается от еды. \n"+getName()+"; Lifespan in Years => "+getLifespan()+"; Mass in kg => "+getMass()+"; Gestation in days => "+getGestation()+"; Length in sm => "+getLength());
    }

    @Override
    public void food() {
        System.out.println(getName()+"; Lifespan in Years => "+getLifespan()+"; Mass in kg => "+getMass()+"; Gestation in days => "+getGestation()+"; Length in sm => "+getLength());
    }
}
