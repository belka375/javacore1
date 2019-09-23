package hw11;

public class Store {


    private WeekDays[] WeekDays;
    private String name;
    private int hours;
    private int employees;
    private WeekDays [] storeClosed;

    public Store( String name, int hours,int employees, WeekDays[] storeClosed ){
        this.name = name;
        this.hours = hours;
        this.employees=employees;
        this.WeekDays=storeClosed;
    
    }

    public Store() {
        
    }

    public void setName (String n){
        this.name =n;

    }
    public void setHours(int h){
        this.hours = h;

    }
    public void setEmployees (int e){
        this.employees=e;

    }
    public void setStoreClosed(WeekDays[] st){
        this.storeClosed = st;
    }
    public String getName(){
        return name;

    }
    public int getHours(int h){
        return hours;
    }
    public WeekDays[] getStoreClosed(){
        return storeClosed;
    }

    public int getEmployees() {
        return employees;
    }
    public void printStoreInfo(){
        System.out.println(""+name+", "+hours+","+employees+".");
        for (WeekDays st : storeClosed){
            System.out.println(st);
        }




    }
}


