package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String password) {
        getInputUserName().sendKeys(user);
        getInputPassword().sendKeys(password);
        loginButtonClick().click();
    }

    public WebElement getInputUserName() {
        return driver.findElement(By.cssSelector("[id='email']"));
    }
    public WebElement getInputPassword() {
        return driver.findElement(By.cssSelector("[id='password']"));
    }
    public WebElement loginButtonClick(){
        return driver.findElement(By.cssSelector("[class='ui large fluid button green-btn pl-btn']"));
    }



}
