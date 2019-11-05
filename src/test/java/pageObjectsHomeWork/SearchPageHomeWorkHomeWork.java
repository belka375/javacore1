package pageObjectsHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPageHomeWorkHomeWork extends BasePageHomeWork {

    public SearchPageHomeWorkHomeWork(WebDriver driver) {
        super(driver);
    }

    private By getTripsByCssSelector() {
        return By.cssSelector(("[class^='Trip__Link']"));
    }

    public List<WebElement> getTrips() {
        wait.until(x -> driver.findElement(getTripsByCssSelector()));
        return driver.findElements(getTripsByCssSelector());
    }
}

