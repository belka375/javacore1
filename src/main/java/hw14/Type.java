package hw14;

public class Type {

        private String name;
        private String category;



        public Type(String name, String category){
            this.name=name;

            this.category=category;

        }

        public String getName() {
            return name;
        }


        public String getCategory() {
            return category;
        }


    public void printInfo(){
        System.out.println(name+ " " +category);
    }

    }



