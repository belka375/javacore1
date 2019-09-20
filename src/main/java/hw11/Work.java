package hw11;


public class Work {
    public static void main (String[] args){
        Amenities[] ament = new Amenities[]{Amenities.DOG_PARK, Amenities.GARAGE};

        Apartment numberOne = new Apartment("Luxury",3425.0, 3100,5, ament);
        Apartment numberTwo = new Apartment("AZALEA", 1000, 600,1, ament);
        Apartment numberThree = new Apartment("CAMELIA", 1240.0, 700, 2, ament);
        Apartment numberFour = new Apartment("BELMONT", 2000, 1800, 4,ament);

        numberOne.printApartmentInfo();
        numberTwo.printApartmentInfo();
        numberThree.printApartmentInfo();
        numberFour.printApartmentInfo();


        System.out.println("---------------------------------------");

        School student = new School (Age.INFANT, 3, ClassLevel.DAYCARE );
        student.setAge(Age.TODDLER);

        School student1 = new School(Age.BIG_KID, 15, ClassLevel.HIGH_SCHOOL);

        School student3 = new School(Age.LITTLE_KID, 5, ClassLevel.KINDERGARDEN);

        student.printStudentInfo();
        student1.printStudentInfo();
        student3.printStudentInfo();

        System.out.println("---------------------------------------");

    }

}
