package workHw11;

public class ComputerCurricula {
    private String instructor;
    private int courseduration;
    private SubjectList subject;


    public ComputerCurricula(String instructor,int courseduration, SubjectList subject){

        this.instructor = instructor;
        this.subject = subject;
        this.courseduration = courseduration;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCourseduration() {
        return courseduration;
    }

    public SubjectList getSubject() {
        return subject;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setCourseduration(int courseduration) {
        this.courseduration = courseduration;
     }

    public void setSubject(SubjectList subject) {
        this.subject = subject;
    }

    public  void printSubject(){

        System.out.println(subject);
    }


}
