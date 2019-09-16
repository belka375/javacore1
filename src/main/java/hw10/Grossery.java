package hw10;

public class Grossery {
    private String dayOfWeek;
    private String nameOfPerson;
    private String [] list;

    public Grossery(){

    }
    public Grossery(String dayOfWeek, String nameOfPerson, String[] list){
        this.list=list;
        this.dayOfWeek=dayOfWeek;
        this.nameOfPerson=nameOfPerson;

    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public String[] getList() {
        return list;
    }
    public void printListOfGrossery(){
        System.out.println(nameOfPerson+" "+dayOfWeek);
        for(String ls: list){
            System.out.println(ls+" ");
        }
    }
}
