package hw10;

public class Employee {

    private String firstName;
    private String lastName;
    private String[] responsibilities;
    private double salary;

    public Employee(){}

    public Employee(String firstName, String lastName, String[] responsibilities, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.responsibilities = responsibilities;
        this.salary = salary;
    }

    public void setFirstName(String firstName1) {
        this.firstName = firstName1;
    }

    public void setLastName(String lastName1) {
        this.lastName = lastName1;
    }

    public void setResponsibilities(String[] resp) {
        this.responsibilities = resp;
    }

    public void setSalary(int payment) {
        this.salary = payment;
    }

    public String getResponsibilities() {
        String responsibilities = "";
        for (String str : this.responsibilities) {
            if (responsibilities != "") {
                responsibilities += ", ";
            }
            responsibilities += str;
        }
        return responsibilities;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getSalary() {
        return this.salary;
    }


    public void printEmployeeInfo() {
        System.out.println("Name: " + firstName + " " + lastName + " " + "\nSalary: " + salary + "\nResponsibilities:");
        for (String resp : responsibilities) {
            System.out.print(resp +"\n");
        }

    }
}