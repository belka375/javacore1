package workHw11;

public class StudentGrades {
    private LetterGrade[] letterGrades;
    private String studname;
    private String course;
    private int score;

    public StudentGrades(String stname, String course, int score,LetterGrade[] letterGrades) {

        this.studname = stname;
        this.course = course;
        this.score = score;
        this.letterGrades = letterGrades;

    }

    public String getStudname() {
        return studname;
    }

    public int getScore() {
        return score;
    }

    public String getCourse() {
        return course;
    }

    public LetterGrade[] getLetterGrades() {
        return letterGrades;
    }



    public  void printGrade() {

        for (LetterGrade gg :letterGrades) {
            System.out.println(gg + "\n");
        }

    }
}








