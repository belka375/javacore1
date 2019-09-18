package HW8;

    public class Dog {

        public String name;
        public String behavior;
        public String breed;
        public int weight;
        public String size;

        public void protect() {
            System.out.println("protect");
        }

        public void eat(){
            System.out.println("eat");
        }
        public void bark(){
            System.out.println("bark");
        }
        public void printDogInfo(){
            System.out.println("The dog's name is "+name+ "; this dog is " +behavior+ "; the breed is " +breed+ "; the weight is " +weight+ " pounds. This dog is " +size );
        }
    }


