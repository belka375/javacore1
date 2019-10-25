package shw10;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SignUpPageHw {
    private WebDriver driver;
    Wait<WebDriver> wait;


    public SignUpPageHw(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);


//        public void signUp (String user, String password){
//            System.out.println("in the login method");
//            getEmai().sendKeys(user);
//            System.out.println("send username");
//            getPassword().sendKeys(password);
//            getRegisterButton().click();
//        }


    }

    public void signUp(String user, String password, String s) {
    getUserField().sendKeys(user);
    getEmailField().sendKeys(s);
    getPasswordField().sendKeys(password);
    getRegisterButton.click();
    }

    private WebElement getRegisterButton() {
        return driver.findElement(By.cssSelector(".green-btn"));
    }

    private WebElement getPasswordField() {
       return driver.findElement(By.cssSelector("#password"));
    }

    private WebElement getEmailField() {
        return driver.findElement(By.cssSelector("#email"));
    }

    private WebElement getUserField() {
        return driver.findElement(By.cssSelector("#username"));
    }


}