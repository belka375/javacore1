package hw11;

public class School {
    private Age age;
    private int yearsOld;
    private ClassLevel classLevel;

    public School(Age age, int yearsOld, ClassLevel classLevel) {
        this.age = age;
        this.yearsOld = yearsOld;
        this.classLevel = classLevel;
    }

    public Age getAge() {
        return age;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public ClassLevel getClassLevel() {
        return classLevel;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void setClassLevel(ClassLevel classLevel) {
        this.classLevel = classLevel;
    }

    public void printStudentInfo (){
        System.out.println("Student info: "+age+", "+yearsOld+ " years old, goes to " +classLevel);
    }
}
