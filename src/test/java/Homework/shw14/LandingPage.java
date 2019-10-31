package Homework.shw14;

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


    private WebElement getCreateTripLink(){
        var createTripLink = wait.until(x->driver.findElement(By.xpath("//*[text()='Create a Trip & Start Earning']")));
        return createTripLink;

    }
    public void clickCreateTrip(){
        getCreateTripLink().click();
    }

    private LandingPage openNewTripPage() {
        var tripCreator = new LandingPage(driver);
        return tripCreator;
    }

}