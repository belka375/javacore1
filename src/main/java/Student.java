public class Student {
    private String name;
    private String lastName;
    private String major;
    private String[] subjects;

    public Student (String name, String ln, String major, String[] subjects){
        this.name=name;
        this.lastName=ln;
        this.major=major;
        this.subjects=subjects;
    }
    public Student(){}

    public void superSetter(String name, String ln, String major, String[] subjects){
        this.name=name;
        this.lastName=ln;
        this.major=major;
        this.subjects=subjects;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String getMajor() {
        return major;
    }

    public void printStudentInfo(){
        System.out.println("--------------");
        System.out.print(name+" "+ lastName+ " "+ major+" ");
        for (String subj: subjects){
            System.out.print(subj+" ");
        }
    }
}
