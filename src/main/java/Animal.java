//public class Dog {
//
//    String name;
//    String breed;
//    String color;
//    int age;
//    int size;
//
//    public void printNameBreedColor(){
//        System.out.println("My dog's name is " +name+ ";\n His breed is " +breed+ ";\n His color is " +color);
//
//    }
//
//    public void printAgeSize(){
//        System.out.println("My dog's age is " +age+ ";\n His is huge, his size is " +size+ " pounds;");
//    }
public class Animal{


            private String name;
            private String color;
            private String breed;
            private int age;
            private int weight;
            private String[] food;

            public Animal(String name, String color, String breed, int age, int weight, String[]food){
                this.name=name;
                this.color = color;
                this.breed = breed;
                this.age = age;
                this.weight = weight;
                this.food=food;



            }

            public Animal() {}

            public void setName(String name) {
                this.name = name;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public void setBreed(String breed) {
                this.breed = breed;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public void setFood(String[] food) {
                this.food = food;
            }

            public void printAnimalInfo(){
                System.out.print("--------------");
                System.out.print(name+ " " +color+ " " +breed+ " " +age+ " " +weight+ " ");
                for(String dish:food){
                    System.out.print(dish+ " ");

                }

            }
        }





