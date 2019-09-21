package lesson13;

public class ClassWork {
    public static void main(String[] args) {

        PersonalName ivanDole=new PersonalName("Ivan", "Dole");
        Address address=new Address(ivanDole, "155 Madison ave", "NYC", "NY", 10008);
        Monitor monitor=new Monitor();
        monitor.model="Model";
        SystemBlock sb=new SystemBlock();
        sb.name="System";
        Computer pc=new Computer(sb, monitor);

        House house = new House(address, 5,4,8887,pc);



        String name=house.getAddress().getName().getLastName();
        System.out.println(name);

    }
}
