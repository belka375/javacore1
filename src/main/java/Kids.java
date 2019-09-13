public class Kids {

    public String name;
    public int age;
    public String boyOrGirl;
    public boolean student;
    public int grade;

    public void printInfo() {
        if (student) {
            System.out.print("What you need to know about this kid:\nName: " + name + ";\nAge: " + age + ";\nSex: " + boyOrGirl + ";\nGrade: " + grade + ".\n");
        } else {
            System.out.print("What you need to know about this kid:\nName: " + name + ";\nAge: " + age + ";\nSex: " + boyOrGirl + ".");
        }
    }


}
