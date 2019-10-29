package Homework.shw13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage{

    public LandingPage(WebDriver driver){
        super(driver);
    }

    public void open() {
        driver.get("https://deens-master.now.sh/");
    }


    public SearchPage open(String destination){
        var city = driver.findElement(By.xpath("//*[contains(@class, 'NewYork')]"));
        city.click();
        return new SearchPage(driver);
    }

}