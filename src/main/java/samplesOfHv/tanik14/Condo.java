package samplesOfHv.tanik14;


    public class Condo extends PlaceForRent{

        private int floorNumber;

        public Condo(String placeName, boolean available, int rooms, int bathrooms, Appliances[] appliances, int floorNumber){
            super(placeName, PlaceType.CONDO, available, rooms, bathrooms, appliances);
            this.floorNumber=floorNumber;
        }

        public void setFloorNumber(int floorNumber) {
            this.floorNumber = floorNumber;
        }

        public int getFloorNumber() {
            return floorNumber;
        }

        public void printCondo(){
            printPlaceForRent();
            System.out.println("\nFloor Number: "+floorNumber);
        }
    }


