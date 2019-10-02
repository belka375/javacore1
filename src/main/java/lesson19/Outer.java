package lesson19;

public class Outer {
    private int number;
    private String room;
    private double sq;


    public Outer(int number, String room, double sq) {
        this.number = number;
        this.room = room;
        this.sq = sq;

    }

    public int getNumber() {
        return number;
    }

    public double getSq() {
        return sq;
    }

    public String getRoom() {
        return room;
    }

    public void printInfo() {
        System.out.println("The Office number is: " + number + "; This Class of " + room + " and  it is " + sq + " sq.feet.");
    }

    //================================================================================================================================

    public class Inner {
        private int windows;
        private int flowers;
        private int tables;

        public Inner(int windows, int flowers, int tables) {
            this.windows = windows;
            this.flowers = flowers;
            this.tables = tables;
        }

        public int getFlowers() {
            return flowers;
        }

        public int getTables() {
            return tables;
        }

        public int getWindows() {
            return windows;
        }

        public void printInfo() {
            System.out.println("In this room we have " + windows + " windows" + " and " + flowers + " flowers; " + "\nClass has " +
                    tables + " tables.");
        }
    }

}
