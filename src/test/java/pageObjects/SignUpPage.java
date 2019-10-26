package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver) {
        super(driver);
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
