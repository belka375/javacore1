package lesson12;

public class School {
    private String name;
    private Student[] students;
    private Address address;

    public School(String name, Student[] students, Address address){
        this.name=name;
        this.address=address;
        this.students=students;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Student[] getStudents() {
        return students;
    }
    public void printSchool(){
        System.out.println(name);
        address.printAddress();
        for (Student student:students){
            student.printStudent();
        }
    }
}

