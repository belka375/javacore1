public class Student {
   private String name;
   private String lastName;
   private String major;
   private String[] subjects;

   public Student(String name, String lastName, String major, String[] subjects){
       this.name=name;
       this.lastName=lastName;
       this.major=major;
       this.subjects=subjects;
   }
    protected Student(){}
    public  void superSetter(String name, String lastName, String major, String[] subjects){
        this.name=name;
        this.lastName=lastName;
        this.major=major;
        this.subjects=subjects;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    public String getMajor;
    public void printStudentInfo(){
        System.out.println("---------------");
        System.out.print(name+" "+lastName+" "+major+" ");
        for (String subj:subjects) {
            System.out.print(subj+" ");
        }
    }
}
