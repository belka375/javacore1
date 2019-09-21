package lesson13;

public class Classwork {
    public static void main(String[] args) {

        PersonalName ivanDole=new PersonalName("Ivan", "Dole");
        Address address=new Address(ivanDole,"155 Madison ave", "NYC", "NY", 10008);
        Monitor monitor = new Monitor();
        monitor.model="MODEL";
        SystemBlock sb=new SystemBlock();
        sb.name="SYSTEM";
        Computer pc = new Computer(sb,monitor);

        House house =new House(address, 5,4,8887, pc);
        house.getAddress().getName().g

    }
}
