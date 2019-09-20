package les12;

public class ClassWork {
    public static void main(String[] args){
        Student dina= new Student( "Dina", "Ivanova", 102);
        Student boris = new Student("Boris", "Karlov", 103);
        Student alex= new Student("Alexey", "Kozlov", 104);
        Student[] sds=new Student[]{dina, boris, alex};

        School mathSchool = new School("Mathimatic School", sds);
        mathSchool.printSchool();

    }
}
