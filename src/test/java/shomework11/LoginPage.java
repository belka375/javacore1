package shomework11;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    Wait<WebDriver> wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait= new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofMillis(100))
                .ignoring(StaleElementReferenceException.class)
            .ignoring(Exception.class);
    }
    public void login(String user, String password){
        getEmailField().sendKeys(user);
        getPassword().sendKeys(password);
        getButton().click();
    }

    private WebElement getButton() {
        return wait.until(x->driver.findElement(By.cssSelector("[data-testid='loginSubmit']")));

    }

    private WebElement getPassword() {
        return driver.findElement(By.cssSelector("#password"));
    }

    private WebElement getEmailField() {
        return wait.until(x->driver.findElement(By.cssSelector("#email")));
    }

}
