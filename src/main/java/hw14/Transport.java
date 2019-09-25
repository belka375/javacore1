package hw14;


    public class Transport {

        private String car;
        private String color;

        public Transport(String car, String color){

            this.car=car;
            this.color=color;
        }

        public String getCar() {
            return car;
        }

        public String getColor() {
            return color;
        }

        public void printInfo() {
            System.out.println(car+ " " +color);
        }
    }


