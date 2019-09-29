

 package workHw11;

    /*
     * Homework 11.1
     *Make enum (or 2 enum)
     * 1.Make two classes - in the first class attribute to make the enum
     * 2.in second class Grade - attribute type enum []
     */


//#1
        public class Work {

        public static void main(String[] args) {

            SubjectList sub1 = SubjectList.JAVA;
            SubjectList sub2 = SubjectList.RUBY;
            SubjectList sub3 = SubjectList.ANGULAR;

            System.out.println(sub2);



            ComputerCurricula curricula1 = new ComputerCurricula(" Cynthia Bond", 80, SubjectList.RUBY);
            ComputerCurricula curricula2 = new ComputerCurricula(" James Golsing", 120, SubjectList.JAVA);
            curricula2.printSubject();

 //#2
            LetterGrade[] gradeArrays = new LetterGrade[]{LetterGrade.A, LetterGrade.B, LetterGrade.C, LetterGrade.D, LetterGrade.F};
            System.out.println("---------------------------------");

            StudentGrades alex = new StudentGrades ("Alex Demer","Algebra",80, new LetterGrade[]{LetterGrade.B});

            alex.printGrade();


        }

    }