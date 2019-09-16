public class Work {
    public static void main(String[]args){

//
//        Dog animal=new Dog();
//        animal.name="Muchtar";
//        animal.breed= "Bolonka";
//animal.color="Pink";
//animal.age=55;
//animal.size=100;
//
//animal.printAgeSize();
//animal.printNameBreedColor();
//
//
//    }

        String[] food =new String[]{"meat", "chicken", "grass", "pasta", "water"};
        Animal murka= new Animal("Murka", "Pink", "Gorilla", 32, 200, food);
        Animal tuzik= new Animal("Tuzik", "Green", "Giraffe", 15, 100, food);
        Animal borka= new Animal("Bor'ka", "White", "Bear", 300, 600, food);

        Animal vaska = new Animal();

        vaska.setName("Vas'ka");
        vaska.setColor("White");
        vaska.setAge(16);
        vaska.setColor("Black");
        vaska.setBreed("Rooster");
        vaska.setFood(food);

        murka.printAnimalInfo();
        vaska.printAnimalInfo();
        tuzik.printAnimalInfo();
        borka.printAnimalInfo();


        String[] dishes = new String[]{"blini", "shashliki", "hachapuri", "pahlava"};

        States florida = new States("Florida", 300000, "Talahassi", dishes);
        States california = new States("California", 10000000, "Sacramento", dishes);

        florida.printStatesInfo();
        california.printStatesInfo();



        String[] usage= new String[]{"dig", "do not dig"};
        Vehicle tractor = new Vehicle("Tractor", "Old Tractor X55", 1990, usage);
        Vehicle bus = new Vehicle("Bus", "EV4567", 1500, usage);

        tractor.printVehicleInfo();
        bus.printVehicleInfo();
    }}




