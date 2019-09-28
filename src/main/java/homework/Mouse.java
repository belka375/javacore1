package homework;

import java.time.LocalDate;

public class Mouse extends Component {
    private boolean wireless;

    public Mouse (Make make, String model, LocalDate yearOfMake, Color color, boolean wireless){
        super(make, model, yearOfMake, color);
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }
}
