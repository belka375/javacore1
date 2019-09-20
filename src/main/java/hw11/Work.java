package hw11;

public class Work {
    public static void main (String[] args){

        SolarSystem allPlanets = SolarSystem.MERCURY;
        SolarSystem planet1= SolarSystem.MERCURY;
        SolarSystem planet2 = SolarSystem.VENUS;
        SolarSystem planet2_1=planet1;
        SolarSystem planet3=SolarSystem.EARTH;
        SolarSystem planet4 =SolarSystem.MARS;
        SolarSystem Planet5 =SolarSystem.JUPITER;
        SolarSystem Planet6 = SolarSystem.SATURN;
        printPlanets(SolarSystem.MARS);


        System.out.println(planet2_1);
//        allPlanets.printPlanetsInfo();

//        Planet  plArray = new Planet(, 88, );

        SolarSystem[] planetName = new SolarSystem [] {SolarSystem.MERCURY, SolarSystem.VENUS, SolarSystem.EARTH, SolarSystem.MARS, SolarSystem.JUPITER, SolarSystem.SATURN};
//        import static SolarSystem.MERCURY




        System.out.println("---------------------------------------");

        School student = new School (Age.INFANT, 3, ClassLevel.DAYCARE );
        student.setAge(Age.TODDLER);

        School student1 = new School(Age.BIG_KID, 15, ClassLevel.HIGH_SCHOOL);

        student.printStudentInfo();
        student1.printStudentInfo();

        System.out.println("---------------------------------------");


    }
    public static void printPlanets(SolarSystem s){
        System.out.println(s);
    }



}
