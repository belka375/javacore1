package workHw12;

    public class Monitor{
        private String brand;
        private String model;
        private int diagonal ;
        private String resolution;

        //to add constructor
        public Monitor(String brand, String mod, int dg, String resol){
            this.brand = brand;
            this.model = mod;
            diagonal = dg;
            resolution = resol;

        }

        //getter
        public void printMonitor(){
            System.out.println( "Monitor characteristics:" + " Brand:"+  brand + " Model:" + model + " Resolution:"  + resolution +  " Diagonal: " + diagonal);
        }
    }

