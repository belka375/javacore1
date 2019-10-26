package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String password) {
        getInputUserName().sendKeys(user);
        getInputPassword().sendKeys(password);
        loginButtonClick().click();
        //Assert
        Assert.assertTrue(getIcon().isDisplayed());
    }

    private WebElement getInputUserName() {
        return driver.findElement(By.cssSelector("[id='email']"));
    }
    private WebElement getInputPassword() {
        return driver.findElement(By.cssSelector("[id='password']"));
    }
    private WebElement loginButtonClick(){
        return driver.findElement(By.cssSelector("[class='ui large fluid button green-btn pl-btn']"));
    }
    private WebElement getIcon(){
        return  driver.findElement(By.xpath("//*[@id='root']/div/header/div/div/div[2]/div/div/div[2]/div[1]/img"));
    }



}
