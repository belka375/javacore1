package hw14;

public class Work {

        public static void main(String[]args){


            SalesPerson one=new SalesPerson("Kuzya", "Pupkin", 12345);
            Address address1 = new Address("123 main", "Odessa", 33160, "Fl");
            Type store1;
            store1 = new Type("Bloomingdales", "Mall");
            Transport kuzyacar =new Transport("BMW", "orange");

            DressCode[] aaa =new DressCode[]{DressCode.PARTY};




            DressCode[] bbb =new DressCode[]{DressCode.OFFICE};
            Transport johnCar =new Transport("lada", "white");
            Security one2;
            one2 = new Security("john", "Ivanov", 12345);
            Address address2;
            address2 = new Address("Collins ave", "Miami", 33009, "Fl");
            Type store2=new Type("Trader Joe's", "Supermarket");





            Stores bloomingdales = new Stores(address1, store1, one, aaa, kuzyacar);
            Stores traderjoes = new Stores(address2, store2, one2, bbb, johnCar);

            bloomingdales.printStoresInfo();
            traderjoes.printStoresInfo();
        }
    }






















