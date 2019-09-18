package homeWorl10;

public class Vehicle {


        private String name;
        private String color;
        private String[] model;

        public Vehicle(String name, String color, String[] model) {
            this.name = name;
            this.color = color;
            this.model = model;
        }

        public Vehicle() {
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setModel(String[] model) {
            this.model = model;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public String[] getModel() {
            return model;
        }

        public void printVehicle(){
            System.out.println("This is Vehicle:");
            System.out.println(name + " " + color);
            for (String model: model){
                System.out.print(model + " ");
                System.out.println("");
            }
        }
    }

