public class States {

        private String state;
        private int population;
        private String capital;
        private String[] dishes;


        public States(String state, int population, String capital, String[] dishes) {
            this.state = state;
            this.population = population;
            this.capital = capital;
            this.dishes = dishes;
        }

        public States() {

        }
        public void setState(String state){
            this.state=state;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public void setCapital(String capital) {
            this.capital = capital;
        }

        public void setDishes(String[] dishes) {
            this.dishes = dishes;
        }
        public void printStatesInfo(){
            System.out.print("The State is " +state+ "; Population in this State is " +population+ "; Capital of the State is " +capital+ "; The food is " );
            for (String food:dishes){
                System.out.print(food + " ");
            }
        }
    }



