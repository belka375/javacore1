package hw14;

public class Stores {



        private Address address;
        private Type type;
        private Employee employee;
        private DressCode[] dressCode;
        private Transport transport;

        public Stores(Address address, Type type, Employee employee, DressCode[] dressCode, Transport transport){
            this.address=address;
            this.type=type;
            this.employee=employee;
            this.dressCode=dressCode;
            this.transport=transport;
        }
        public Address getAddress() {
            return address;
        }
        public Type getType() {
            return type;
        }
        public Employee getEmployee() {
            return employee;
        }
        public DressCode[] getDressCode() {
            return dressCode;
        }
        public Transport getTransport() {
            return transport;
        }

        public void printStoresInfo() {
            address.printInfo();
            type.printInfo();
            employee.printInfo();
            transport.printInfo();
for(DressCode dc: dressCode){
    System.out.println(dc);
}

            }

        }

