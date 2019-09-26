package samplesOfHv.tanik14;

    public class Townhouse extends PlaceForRent{

        private int numberOfStories;
        private boolean isAttached;

        public Townhouse(String placeName, boolean available, int rooms, int bathrooms, Appliances[] appliances, int numberOfStories, boolean isAttached){
            super(placeName, PlaceType.TOWNHOUSE, available, rooms, bathrooms, appliances);
            this.numberOfStories=numberOfStories;
            this.isAttached=isAttached;
        }

        public void setNumberOfStories(int numberOfStories) {
            this.numberOfStories = numberOfStories;
        }

        public void setAttached(boolean attached) {
            isAttached = attached;
        }

        public int getNumberOfStories(){
            return numberOfStories;
        }

        public boolean getAttached(){
            return isAttached;
        }

        public void printTownhouse(){
            printPlaceForRent();
            System.out.println("\nNumber of Stories: "+numberOfStories+";\nAttached: "+isAttached+";");
        }
    }

