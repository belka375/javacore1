package hw11;

public class Workouts {
    private String studentName;
    private int grade;
    private WeekDays workouts;

    public Workouts (){}
    public Workouts (String studentName, int grade, WeekDays workouts){
        this.studentName=studentName;
        this.grade=grade;
        this.workouts=workouts;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setWorkouts(WeekDays workouts) {
        this.workouts = workouts;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }

    public WeekDays getWorkouts() {
        return workouts;
    }

    public void printStudentWorkout(){
        System.out.println("********************");
        System.out.println(studentName+" is "+grade+" grade student"+ " has workout on "+workouts);
    }
}


