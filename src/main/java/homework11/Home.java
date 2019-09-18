package homework11;

import java.util.Arrays;

public class Home {
    private Kitchenware[] homeUtensils;
    private boolean available;
    
    public void kitchenwareInfo() {
            System.out.println(Arrays.toString(homeUtensils) + " "+ available);
        }


    public Home (Kitchenware[] homeUtensils, boolean available){
        this.homeUtensils = homeUtensils;
        this.available = available;

    }

    public boolean getAvailable() {
        return available;
    }

    public Kitchenware[] getHomeUtensils() {
        return homeUtensils;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setHomeUtensils(Kitchenware[] homeUtensils) {
        this.homeUtensils = homeUtensils;
    }
}
