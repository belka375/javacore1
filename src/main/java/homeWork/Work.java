package homeWork;

public class Work {

    public static void main(String[] args) {
    Kids Aibek = new Kids();
    Aibek.firstName = "Aibek";
    Aibek.lastName = "Zh";
    Aibek.yearBirth = 1998;
    Aibek.study = "Buffalo University";
    Aibek.sport = "swimming";
    Aibek.printMyKids();

    System.out.println("===============================================");

        Parents Mama = new Parents();
        Mama.firstName = "Lubov";
        Mama.lastName = "Kotova";
        Mama.yearBirth = 1950;
        Mama.work = "Owner";
        Mama.sport = "Jogging";
        Mama.printMyParents();

        System.out.println("===============================================");

        Pets Rada = new Pets();
        Rada.name = "Rada";
        Rada.breed = "Fox terrier";
        Rada.family ="Dog";
        Rada.gender = "My girl";
        Rada.yearBirth = 2000;
        Rada.printMyPet();




    }








}
