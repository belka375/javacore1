package hw14;

public class Employee {


        protected String lName;
        protected String fName;
        protected int id;


        public Employee(String fName, String lName, int id) {

            this.lName = lName;
            this.fName = fName;
            this.id = id;
        }

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public int getId() {
            return id;
        }

        protected void printEmployee(){
            System.out.println(fName+ " " +lName+ " "+id);
        }

    public void printInfo() {
        System.out.println(lName+ " " +fName+ " "+id);
    }
}


