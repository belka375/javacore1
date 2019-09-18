package hw10;

public class Work10 {
    public static void main(String[] args) {

        String[] vac = new String[]{"Main vaccine", "Second vaccine", "Mandatory vaccine"};
        Cat marusya = new Cat();
        marusya.setName("Marusya");
        marusya.setBreed("scottish");
        marusya.setWeight(10);
        marusya.setLongHair(true);
        marusya.setVaccine(vac);
        Cat fedor = new Cat("Fedor", "siberian", 8, false, vac);

        marusya.printCatInfo();
        fedor.printCatInfo();

        String[] acc = new String[]{"Babies", "Toddlers", "Teens", "Adults"};
        Pool bigpool = new Pool();
        bigpool.setForm("circle");
        bigpool.setVolume(500);
        bigpool.setFull(true);
        bigpool.setAccess(acc);
        Pool smallpool = new Pool("square", 200, false, acc);

        bigpool.printPoolInfo();
        smallpool.printPoolInfo();

        String[] grac = new String[]{"All Employees", "8th floor", "QA Team"};
        Employe newman = new Employe();
        newman.setFirstName("John");
        newman.setLastName("Ford");
        newman.setContractor(true);
        newman.setGroupOfAccess(grac);
        Employe newwoman = new Employe("Marya", "Jackson", false, grac);

        newman.printEmployeInfo();
        newwoman.printEmployeInfo();
    }

}
