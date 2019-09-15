package hw8;

public class Work {
    public static void main(String[] args) {

        Cup newCup1 = new Cup();
        newCup1.color = "Red";
        newCup1.material = "Glass";
        newCup1.sign = "Cat person";
        newCup1.handle = false;
        newCup1.changeColor = true;

        newCup1.printCupInfo();
        System.out.println("**********************");

        Cup newCup2 = new Cup();
        newCup2.color = "Blue";
        newCup2.material = "Ceramis";
        newCup2.sign = "Good morning";
        newCup2.handle = true;
        newCup2.changeColor = false;

        newCup2.printCupInfo();
        System.out.println("**********************");

    Person client1 = new Person();
    client1.firstName = "Nick";
    client1.lastName = "Jackson";
    client1.sex = "man";
    client1.age = 32;
    client1.ssn = "333-444-55-6644";
    client1.marriage = true;
    client1.newClient = true;

    client1.printFullName();
    client1.printfullInfo();
    System.out.println("**********************");

    Person client2 = new Person();
    client2.firstName = "Jessica";
    client2.lastName = "Lavin";
    client2.sex = "woman";
    client2.age = 24;
    client2.ssn = "335-444-55-6688";
    client2.marriage = false;
    client2.newClient = false;

    client2.printFullName();
    client2.printfullInfo();
    System.out.println("**********************");

    Phone newProne1 = new Phone();
    newProne1.brand = "Apple";
    newProne1.model = "X11";
    newProne1.os = "iOS";
    newProne1.color = "Grey";
    newProne1.screenSize = 6.5;
    newProne1.cameraNumbers = 3;

    newProne1.printPhoneInfo();
    System.out.println("**********************");
    newProne1.ring();
        System.out.println("**********************");
    newProne1.alarm();
        System.out.println("**********************");
    newProne1.message();

    }
}
