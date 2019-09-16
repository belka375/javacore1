package hw8;

public class WorkFile {
    public static void main(String[]args){


        Owner male = new Owner();
         male.name = "David";
        male.age = 42;
        male.occupation = "Business owner";
        male.info();
        System.out.println("---------------------");

        Owner female = new Owner();
        female.name = "Ira";
        female.age = 41;
        female.occupation = "QA tester";
        female.info();
        System.out.println("---------------------");

        Cat kitten = new Cat();
        kitten.name = "Murzik";
        kitten.color = "red";
        kitten.age = 1;
        kitten.breed = "Russian blue";
        kitten.catInfo();
        System.out.println("---------------------");

        Cat kitty = new Cat();

        kitty.sleep();
        kitty.play();
        System.out.println("---------------------");

        TV mine = new TV();
        mine.brand= "Samsung";
        mine.color = "Silver";
        mine.model = "The Last one";
        mine.TVdescription();
        System.out.println("---------------------");

        TV dave = new TV();
        dave.turnOn();
        dave.connect();




    }

}
