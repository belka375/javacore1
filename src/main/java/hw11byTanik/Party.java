package hw11byTanik;

public class Party {

    private String holiday;
    private String date;
    private Family[] attendees;

    public Party(){
    }

    public Party(String hol, String data, Family[] attend){
        this.holiday=hol;
        this.date=data;
        this.attendees=attend;
    }

    public void setHoliday(String h){
        this.holiday=h;
    }

    public void setDate(String d){
        this.date=d;
    }

    public void setAttendees(Family[] att){
        this.attendees=att;
    }

    public String getHoliday(){
        return holiday;
    }

    public String getDate(){
        return date;
    }

    public Family[] getAttendees(){
        return attendees;
    }

    public void printInfoParty(){
        System.out.print("\nWhat are we selebrating: "+holiday+";\nWhen are we having the party: "+
                date+";\nWho is attending: ");
        for (Family att:attendees) {
            System.out.print(att+" ");
        }
    }

}
