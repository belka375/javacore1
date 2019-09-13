public class QaSchool {
    public String name;
    public String establishedAt;
    public int numberOfStudents;
    public String address;
    public int numberEmlpoyedGraduates;

    public void schoolName() {
        System.out.println(name+ " " + establishedAt+ " " + " " + address );
    }

    public void quality() {
        if ( numberEmlpoyedGraduates > 20 && numberOfStudents > 20) {
            System.out.println("Quality is good");
        }
    }

}
