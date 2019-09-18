package hw11;

public class Work {
    public static void main(String[] args) {

        Workouts rachel = new Workouts();
        rachel.setStudentName("Rachel");
        rachel.setGrade(5);
        rachel.setWorkouts(WeekDays.FRIDAY);
        rachel.printStudentWorkout();

        Workouts kevin = new Workouts("Kevin", 2, WeekDays.THURSDAY);
        kevin.printStudentWorkout();

        Employee johnBlack = new Employee();
        Degree[] degrees = new Degree[]{Degree.ASSOCIATE, Degree.BACHELOR, Degree.MASTER, Degree.DOCTOR};
        johnBlack.setEmployeeName("John Black");
        johnBlack.setLevel(15);
        johnBlack.setDegrees(degrees);
        johnBlack.printEmployeeInfo();
    }
}
