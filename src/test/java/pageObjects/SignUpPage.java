package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SignUpPage {
    private WebDriver driver;
    Wait<WebDriver> wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class);
    }

//    public LandingPage signUp(String user, String email, String password21) {
//        //fill the field and click to the button register
//        getUserField().sendKeys(user);
//
//        getEmailField().sendKeys(email);
//
//        getPasswordField().sendKeys(password21);
//        getRegisterButton().click();
//        return new LandingPage(driver);
//    }

//    private WebElement getUserField() {
//        return wait.until(x->driver.findElement(By.id("username")));
//    }
    private WebElement getUserNameField(){
        return wait.until(x->driver.findElement(By.id("username")));
    }

    private WebElement getRegisterButton() {
        return driver.findElement(By.xpath("//button[contains(text(),'Register')]"));

    }

    private WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    private WebElement getEmailField() {
        return driver.findElement(By.id("email"));
    }

    public LandingPage registerNewUser(String username, String email, String password) {
        getUserNameField().sendKeys(username);
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys();
        getRegisterButton().click();
        return new LandingPage(driver);
    }

}
