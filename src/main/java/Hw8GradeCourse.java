
import java.util.Scanner;

public class Hw8GradeCourse {

    String coursename;
    int grade;
    Boolean retaken;

    public void displayGreeting()

    {
        System.out.println("Welcome to the Test Room!");
    }

    public void gradeInfo()
    {
        String msg = String.format("You passed a test: %s with grade = %s", coursename, grade);
        if (retaken) {
            msg = msg + " and retaken is true";
        }
        System.out.println(msg);
    }

}