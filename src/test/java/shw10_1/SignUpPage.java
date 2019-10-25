package shw10_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class SignUpPage {
private WebDriver driver;
Wait<WebDriver> fluentWait;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        fluentWait =new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
    }


    public MainPage1 sendDataToRegisterFields() {
        getUserNameField().sendKeys();
        getPasswordField().sendKeys();
        getEmailField().sendKeys();
        registerButton().click();
        return new MainPage1(driver);
    }


    public WebElement getUserNameField(){
        return fluentWait.until(x->driver.findElement(By.cssSelector("[placeholder='Username']")));
    }

    public WebElement getPasswordField(){
        return fluentWait.until(x->driver.findElement(By.cssSelector("[placeholder='Password']")));
    }

    public WebElement getEmailField(){
        return fluentWait.until(x->driver.findElement(By.cssSelector("[placeholder='E-mail address']")));
    }
    public WebElement registerButton(){
        return fluentWait.until(x->driver.findElement(By.xpath("//*[text()='Register']")));
    }




}
