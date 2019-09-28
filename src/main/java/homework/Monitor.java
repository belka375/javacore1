package homework;

import java.time.LocalDate;

public class Monitor extends Component {
    private double screenSize;
    private ScreenType screenType;

    public Monitor(Make make, String model, Color color, LocalDate yearOfMake, double screenSize, ScreenType screenType){
        super(make, model, yearOfMake, color);
        this.screenSize = screenSize;
        this.screenType = screenType;

    }

    public double getScreenSize() {
        return screenSize;
    }

    public ScreenType getScreenType() {
        return screenType;
    }


}
