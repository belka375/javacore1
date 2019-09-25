package hw8;

public class Work {
    public static void main(String[] args) {
       Hobby hobby=new Hobby();
       hobby.friday="soccer";
       hobby.saturday="hiking";
       hobby.sunday="English classes";
       hobby.schedule();

        Vacation vacation=new Vacation();
        vacation.country="USA";
        vacation.city="LA";
        vacation.state="California";
        vacation.visit();

        WorkPlace workPlace=new WorkPlace();
        workPlace.table="L-shaped table";
        workPlace.mouse="magic mouse";
        workPlace.laptop="macbook air";
        workPlace.stuff();


    }
}
