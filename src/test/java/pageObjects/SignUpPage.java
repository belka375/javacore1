package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement getUserName(){
        return driver.findElement(By.cssSelector("[id='username']"));
    }
    private WebElement getEmail(){
        return  driver.findElement(By.cssSelector("[id='email']"));
    }
    private WebElement getPassword(){
        return  driver.findElement(By.cssSelector("[id='password']"));
    }
    private WebElement getRegisterButton(){
        return driver.findElement(By.xpath("//*[contains (text(), 'Register')]"));
    }
    //Assert
    private WebElement getIcon(){
        return  driver.findElement(By.xpath("//*[@id='root']/div/header/div/div/div[2]/div/div/div[2]/div[1]/img"));
    }

    public void signUp(String userName, String email, String password) {
        getUserName().clear();
        getUserName().sendKeys(userName);
        getEmail().clear();
        getEmail().sendKeys(email);
        getPassword().clear();
        getPassword().sendKeys(password);
        getRegisterButton().click();
        //Assert
        getIcon().isDisplayed();

    }


}
