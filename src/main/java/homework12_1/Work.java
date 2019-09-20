package homework12_1;

public class Work {


        public static void main(String[]args){

            Animals gorilla = new Animals("Gorilla", "Masha", 35);
            Animals turtle = new Animals ("Turtle", "Kuzya", 155);
            Animals zebra =new Animals("Zebra", "Ponchik", 2);
            Animals[] a= new Animals[]{gorilla, turtle, zebra};
            Address zooAddress=new Address("123 main", "Miami", "Florida", 33160);

            Zoo miami=new Zoo("Miami", a, zooAddress);
            miami.printZoo();

        }
    }




