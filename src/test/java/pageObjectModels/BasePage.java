package pageObjectModels;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;

    public BasePage (WebDriver driver) {

        this.driver = driver;
        wait = new FluentWait<WebDriver> (driver)
                .withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);

    }
}
