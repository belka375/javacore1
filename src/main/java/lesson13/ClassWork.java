package lesson13;

public class ClassWork {
    public static void main(String[] args){

        PersonalName ivanDole=new PersonalName("Ivan","Dole");
        Address address=new Address(ivanDole,"155 Madisson ave", "NYC", "NY",10008);
        Monitor monitor = new Monitor();
        monitor.model="Model";
        SystemBlock sb = new SystemBlock();
        sb.name="System";
        Computer pc=new Computer(sb,monitor);

        House house = new House(address,5,4,8887,pc);

        String monitorModel= house.getComputer().getMonitor().model;
        System.out.println(monitorModel);

        String name=house.getAddress().getName().getFirstName();

        System.out.println(name);

        ivanDole.setFirstName("Ivanka");
        PersonalName neName = ivanDole;
        neName.setLastName("Dollle");




    }
}
