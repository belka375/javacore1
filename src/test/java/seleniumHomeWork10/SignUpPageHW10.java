package seleniumHomeWork10;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.Random;

public class SignUpPageHW10 {
    private WebDriver driver;
    Wait<WebDriver> wait;


    public SignUpPageHW10(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class);
    }

    public LandingPageHW10 signUp(String username, String emeil, String password) {
        Random randomSelector = new Random();
        var randomNumber = randomSelector.nextInt(1500);
        getUsernameInputField().sendKeys(username + randomNumber);
        getEmailInputField().sendKeys(emeil + randomNumber + "@gmial.com");
        getPasswordInputField().sendKeys(password + randomNumber);
        getRegisterButton().click();
        return new LandingPageHW10(driver);
    }


    private WebElement getUsernameInputField() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@id='username']")));
    }

    private WebElement getEmailInputField() {
        return driver.findElement(By.xpath("//*[@id='email']"));
    }

    private WebElement getPasswordInputField() {
        return driver.findElement(By.xpath("//*[@id='password']"));
    }

    private WebElement getRegisterButton() {
        return driver.findElement(By.xpath("//*[text()='Register']"));
    }
}

