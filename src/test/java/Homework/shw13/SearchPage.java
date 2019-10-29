package Homework.shw13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private By getTripXpath() {
        return By.xpath("//*[contains(@href, 'book')]");
    }

    public List<WebElement> getTrips(){
        wait.until(x->driver.findElement(getTripXpath()));
        return driver.findElements(getTripXpath());
    }
}
