package hw8;

public class Person {
    public String firstName;
    public String lastName;
    public String sex;
    public double age;
    public String ssn;
    public boolean marriage;
    public boolean newClient;

    public void printFullName(){
        System.out.println(firstName+" "+lastName);
    }
    public void printfullInfo(){
        System.out.println("First Name="+firstName+";\nLast Name="+lastName+";\nSex="+sex+";\nAge="+age+";\nSSN="+ssn);
    }

}
