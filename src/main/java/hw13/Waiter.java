package hw13;

public class Waiter {



        private String fName;
        private String lName;
        public Employee employee;

        public Waiter(String fName, String lName, Employee employee){
            this.fName=fName;
            this.lName=lName;
            this.employee=employee;
        }

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public Employee getEmployee() {
            return employee;
        }
    }


