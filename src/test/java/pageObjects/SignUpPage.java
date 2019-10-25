package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signUp(String userName, String email, String password) {
        getUserName().clear();
        getUserName().sendKeys(userName);
        getEmail().clear();
        getEmail().sendKeys(email);
        getPassword().clear();
        getPassword().sendKeys(password);
        getRegisterButton().click();
    }

    public WebElement getUserName(){
        return driver.findElement(By.cssSelector("[id='username']"));
    }
    public WebElement getEmail(){
        return  driver.findElement(By.cssSelector("[id='email']"));
    }
    public WebElement getPassword(){
        return  driver.findElement(By.cssSelector("[id='password']"));
    }
    public WebElement getRegisterButton(){
        return driver.findElement(By.xpath("//*[contains (text(), 'Register')]"));
    }
}
