package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SignUpPage {
    WebDriver driver;

    Wait<WebDriver> wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class);
    }

    private WebElement getUsernameField() {
        return wait.until(x->driver.findElement(By.id("username")));
    }
    private WebElement getEmailField(){
        return driver.findElement(By.id("email"));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.id("password"));
    }
    private WebElement getRegisterButton(){
        return driver.findElement(By.xpath("//*[text()='Register']"));
    }

    public LandingPage registerNewUser(String username, String email, String password) {
        getUsernameField().sendKeys(username);
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getRegisterButton().click();
        return new LandingPage(driver);
    }
}
