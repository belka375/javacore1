package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DestinationPage extends BasePage {
    public DestinationPage(WebDriver driver) {
        super(driver);
    }
    private By getTripByXpath(){
        return By.xpath("//*[contains@class,'Trip_LinkWrapper')]");
    }
    public List<WebElement> getTrips(){
        wait.until(x->driver.findElement(getTripByXpath()));
        return driver.findElements(getTripByXpath());
    }
}
