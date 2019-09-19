package hw10;

public class MainClass {
    public static void main (String[] args) {

        System.out.println("************************************************");
        String[] petrovRespArr = new String[]{"Management", "Development","Testing"};
        Employee petrov = new Employee("Peter", "Petrov", petrovRespArr, 250000);
        String[] petrovMonths = new String[] {"March", "October"};
        Calendar petrovCalendar = new Calendar(petrovMonths, "Saturday", 2019);

        Calendar holidaysCalendar = new Calendar();
        String[] m = new String[]{"May", "July", "January"};
        holidaysCalendar.setMonths(m);
        holidaysCalendar.setDay("Sunday");
        holidaysCalendar.setYear(2019);

        Employee ivanov = new Employee();
        String[] respArr = new String[]{"Management", "Development", "Testing"};
        ivanov.setFirstName("Ivan");
        ivanov.setLastName("Ivanov");
        ivanov.setResponsibilities(respArr);
        ivanov.setSalary(200000);

        String vacationMonths = holidaysCalendar.getMonths();
        String holiday = holidaysCalendar.getDay();
        int currentYear = holidaysCalendar.getYear();

        String fName = ivanov.getFirstName();
        String lName = ivanov.getLastName();
        String resp1 = ivanov.getResponsibilities();
        double pay = ivanov.getSalary();

        System.out.println("First name: " + fName + "." + "\nLast name: " + lName + "." + "\nResponsibilities: " + resp1 + "." + "\nSalary: " + pay + ".");
        System.out.println("Preferred months for vacations in " + currentYear + ": " + vacationMonths + "." + "\nNext holiday: " + holiday + ".");

        System.out.println("************************************************");

        petrov.printEmployeeInfo();

        holidaysCalendar.printVacationCalendar();


    }
}
