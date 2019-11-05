package pageObjectsHomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BasePageHomeWork {
    protected WebDriver driver;
    protected Wait<WebDriver>wait;

    public BasePageHomeWork(WebDriver driver){
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(Exception.class);
    }
}
