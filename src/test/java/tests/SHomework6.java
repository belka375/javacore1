package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SHomework6 {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://deens-master.now.sh/");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void teardown () throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void deens_TryToLoginUsingWrongCredentials_LoginFailedErrorMessageAppear() throws InterruptedException {
        WebElement loginButton1 = driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton1.click();
        Thread.sleep(3000);
        WebElement emailField = driver.findElement(By.xpath("//*[@name='email']"));
        emailField.sendKeys("blablabla");
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='email']/parent::*/parent::*/following-sibling::div[@class='required field']//input[@name='password']"));
        passwordField.click();
        passwordField.sendKeys("blalala");
        WebElement loginSubmit = driver.findElement(By.xpath("//input[@name='email']/parent::*/parent::*/following-sibling::button[@data-testid='loginSubmit']"));
        loginSubmit.click();
        Thread.sleep(3000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@class='header']"));
        String message = errorMessage.getText();
        Assert.assertEquals(message, "Cannot login");





//        passwordField.sendKeys("blablabla");
//        loginSubmit.click();
    }



}
