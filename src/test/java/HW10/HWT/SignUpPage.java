package HW10.HWT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class SignUpPage {
    private WebDriver driver;
    Wait<WebDriver>wait;
    public SignUpPage(WebDriver driver){
        this.driver=driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
    }

    public void signup(String user, String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getButton().click();
        getUserField().sendKeys(user);
    }

    private WebElement getButton() {
        return driver.findElement(By.xpath("//*[text()='Register']"));
    }

    private WebElement getUserField() {
        return driver.findElement(By.id("username"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    private WebElement getEmailField() {
       return wait.until(x->x.findElement(By.id("email")));
    }
}
