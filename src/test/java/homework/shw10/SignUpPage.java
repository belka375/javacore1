package homework.shw10;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SignUpPage {
    private WebDriver driver;
    Wait<WebDriver>wait;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(50))
                .ignoring(Exception.class);

    }


    public void signUp(String username, String email, String password){
        getUserNameField().clear();
        getUserNameField().sendKeys(username);
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getButton().click();
    }


    private WebElement getUserNameField() {
        return wait.until(x->driver.findElement(By.cssSelector("#username")));
    }
    private WebElement getEmailField() {
        return  driver.findElement(By.id("email"));
    }
    private WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }
    private WebElement getButton() {
        return driver.findElement(By.cssSelector(".green-btn "));
    }



}
