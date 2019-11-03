package HW10.HWT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResults extends BasePages{
    public SearchResults(WebDriver driver){super(driver);}
    private By getTripsByXpath(){
        return By.xpath("//*[contains(@class,'Trip__LinkWrapper')]");

    }
    public List<WebElement> getTrips(){
        wait.until(x->driver.findElement(getTripsByXpath()));
        return driver.findElements(getTripsByXpath());
    }
    }
