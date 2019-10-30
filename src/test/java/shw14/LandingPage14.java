package shw14;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LandingPage14  {
    private WebDriver driver;
    Wait<WebDriver> wait;


    public LandingPage14(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
    }

    public void openPage() {
        driver.get("https://deens-master.now.sh/");
    }

    public WebElement getCreateTripButton() {
        ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Create a Trip & Start Earning']/parent::a"));
        return driver.findElement(By.xpath("//*[text()='Create a Trip & Start Earning']/parent::a"));
    }



}
