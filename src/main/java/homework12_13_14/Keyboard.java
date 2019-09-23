package homework12_13_14;

import java.time.LocalDate;

public class Keyboard extends Component{
    private boolean wireless;

    public Keyboard(Make make, String model, LocalDate yearOfMake, boolean wireless, Color color){
        super(make, model, yearOfMake, color);
        this.wireless = wireless;

    }

    public boolean isWireless() {
        return wireless;
    }

}
