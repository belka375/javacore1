package lesson14;



public class Student extends Person{
    private Subject[] subjects;
    private Subject major;

    public Student(String firstName, String lastName, int data, Subject[] subjects, Subject major){
        super(firstName, lastName,data);
        this.subjects = subjects;
        this.major = major;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public Subject getMajor() {
        return major;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }


    public void printStudent(){
        printPerson();
        for(Subject x: subjects)
        {System.out.print("\nSubject is "+x);}
         System.out.println("\nmajor subject is "+ major);

}
}
