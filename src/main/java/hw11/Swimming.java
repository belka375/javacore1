package hw11;

public class Swimming {

    private String name;
    private Days[] days;

    public Swimming(String nameOrTypeOfClass, Days[] day) {
        this.name = nameOrTypeOfClass;
        this.days = day;
    }

    public String getName() {
        return name;
    }

    public Days[] getDays() {
        return days;
    }

    public void printSwimmingClassesInfo () {
        System.out.println( "\n" + name );
        for (Days day:days) {
            System.out.print( day + "\n" );

        }
    }
}
