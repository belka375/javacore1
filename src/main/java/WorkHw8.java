public class WorkHw8 {
    public static void main(String[] args) {

        Hw8CoffeeMaker mycf =  new  Hw8CoffeeMaker();
        mycf.brand ="Nespresso";
        mycf.year =2018;
        mycf.model = "Precision Brewer";

        mycf.allabout();

//**********************************
        Hw8Movie  myfavm = new Hw8Movie();
        myfavm.genre = "musical drama";
        myfavm.nominate = true;
        myfavm.title = "My Fair Lady";
        myfavm.year = 1964;

        myfavm.myAction();
        myfavm.relDate();
//*************************************
        Hw8GradeCourse mygrade = new Hw8GradeCourse();
        mygrade.retaken =false;
        mygrade.grade = 10;
        mygrade.coursename = "Java for kids";
        mygrade.displayGreeting();
        mygrade.gradeInfo();
//*************************************
        Hw8GradeCourse myOtherGrade = new Hw8GradeCourse();
        myOtherGrade.retaken = true;
        myOtherGrade.grade = 5;
        myOtherGrade.coursename = "C# for Adults";
        myOtherGrade.displayGreeting();
        myOtherGrade.gradeInfo();




    }


}
