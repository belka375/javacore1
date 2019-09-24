package lesson14;



public class  Teacher extends Person{
    private Subject subject;

    public Teacher(String firstName, String lastName, int data, Subject subject){
        super(firstName, lastName, data);
        this.subject = subject;
    }

   public Subject getSubject() {
        return subject;
    }
    public void printTeacher(){
        System.out.println("Teacher is "+firstName+ " "+lastName + " year of birth is " + data+" Subject is " + subject);
    }
}
