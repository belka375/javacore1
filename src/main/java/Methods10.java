public class Methods10 {
    public static void main(String[] args) {
        System.out.println("*************");

        String[] subjs = new String[] {"Math", "History", "Biology", "Social studies"};

        Student john = new Student("John", "Dole", "Finance", subjs);
        Student jane = new Student("Jane", "Dole", "Finance", subjs);
        Student boris= new Student();
        boris.setName ("Boris");
        boris.setLastName("Johnson");
        boris.setMajor ("Politics");
        boris.setSubjects(subjs);

        john.printStudentInfo();
        jane.printStudentInfo();
        boris.printStudentInfo();
        String borisMajor=boris.getMajor();

        boris.superSetter("ne Boris", " ne Jonson", "New",subjs);

        boris.printStudentInfo();


//        CellPhone iPhone = new CellPhone("Apple","11", 6);//creating new object
//        CellPhone samsung = new CellPhone();//creating new empty object
//        iPhone.setScreenSize(5.5);//modifying the object
//
//        Book book1 = new Book("Anchar");
//        Book book = new Book();//new - выделение памяти
//        Book book3 = new Book("Bukvar", "Rumyancev", 15, 2010);


    }
}
