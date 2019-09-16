public class School {

    private String schoolName;
    private int highestGrade;
    private String[] subjects;


    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setHighestGrade(int highestGrade) {
        this.highestGrade = highestGrade;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getHighestGrade() {
        return highestGrade;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public School (String name, int highest, String[] subj){
        this.schoolName=name;
        this.highestGrade=highest;
        this.subjects=subj;
    }

    public void printSchoolInfo(){
        System.out.print("Name: "+schoolName+";\nHighest Grade: "+highestGrade+";\nSubjects: ");
        for (String subject:subjects) {
            System.out.print(subject+" ");

        }
    }

    public School (){};

    }

