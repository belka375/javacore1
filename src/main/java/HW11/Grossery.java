package HW11;

public class Grossery {
        private DayOfWeek [] dayOfWeek;
        private String nameOfPerson;


        public Grossery(){

        }
        public Grossery(DayOfWeek [] dayOfWeek, String nameOfPerson){
            this.dayOfWeek=dayOfWeek;
            this.nameOfPerson=nameOfPerson;

        }

        public void setDayOfWeek(DayOfWeek [] dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }


        public void setNameOfPerson(String nameOfPerson) {
            this.nameOfPerson = nameOfPerson;
        }


        public String getNameOfPerson() {
            return nameOfPerson;
        }

        public DayOfWeek[] getdayOfWeek() {
            return dayOfWeek;
        }
        public void printListOfGrossery(){
            System.out.println(nameOfPerson+" ");
            for(DayOfWeek dw: dayOfWeek){
                System.out.println(dw+" ");
            }
        }
}
