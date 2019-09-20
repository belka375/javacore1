package homework12;


    public class Monitor {

        private Brands [] monitor;
        private int size;
        private String type;

        public Monitor(Brands[] monitor, int size, String type){
            this.monitor=monitor;
            this.size=size;
            this.type=type;

        }

        public Brands[] getMonitor() {
            return monitor;
        }

        public int getSize() {
            return size;
        }

        public String getType() {
            return type;
        }


        public void printMonitor(){

            System.out.println("This monitor is " +type+ "; display size is  " +size+ " inch");

            for (Brands m: monitor){
                System.out.println(m);
            }
        }
    }



