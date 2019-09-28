package hw15;

public class Work {


        public static void main(String[]args){

            Animal borya=new Gorilla("Borya", "Male", 30);
            Animal masha = new Lion("Masha", "Female", 10);
            ProtAnimal murka = new Gorilla("Murka", "Female", 15);
            ProtAnimal jerry = new Cow("Jerry", "Male", 26);
            ProtAnimal umka = new Lion("Umka", "Male", 12);

            printAnimal(borya);
            printAnimal(masha);
            printAnimal(jerry);
            printAnimal(umka);

        }

        private static void printAnimal(ProtAnimal pp){
            pp.printInfo();
        }
    }








