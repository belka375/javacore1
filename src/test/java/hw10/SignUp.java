package hw10;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import java.time.Duration;

public class SignUp {
    WebDriver driver;

    Wait<WebDriver> wait;

    public SignUp(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class);
    }
    public WebElement getUsername(){
        return wait.until(x->driver.findElement(By.id("username")));
    }
    public WebElement getEmail(){
        return driver.findElement(By.id("email"));
    }
    private WebElement getPassword(){
        return driver.findElement(By.id("password"));
    }
    private WebElement getRegisterButton(){
        return driver.findElement(By.xpath("//*[text()='Register']"));
    }

    public MainPage registerUser(String username, String email, String password) {
        getUsername().sendKeys(username);
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getRegisterButton().click();
        return new MainPage(driver);
    }
}

