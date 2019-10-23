package shw10.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    Wait<WebDriver> wait;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
    }

    public void loginManualInput(String Username, String Password) {
        getEmailField().sendKeys(Username);
        getPasswordField().sendKeys(Password);
        getButton().click();
    }

    private WebElement getButton() {
        return driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    private WebElement getEmailField() {
        return wait.until(x->x.findElement(By.id("email")));
    }
}
