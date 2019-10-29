package Homework.shw10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SignupPage {
    private WebDriver driver;
    Wait<WebDriver> wait;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
    }

    public void signup(String username, String email, String password) {
        getUsernameField().sendKeys(username);
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getButton().click();
    }

    private WebElement getButton() {
        return driver.findElement(By.xpath("//button[contains(.,'Register')]"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    private WebElement getEmailField() { return driver.findElement(By.id("email")); }

    private WebElement getUsernameField() {
        return wait.until(x->x.findElement(By.id("username")));
    }

}
