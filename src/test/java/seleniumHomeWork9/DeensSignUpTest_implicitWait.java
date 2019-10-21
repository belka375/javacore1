package seleniumHomeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DeensSignUpTest_implicitWait {
    private WebDriver driver;


    @BeforeMethod
//create driver
    public void startUp() {
        System.setProperty("wbdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
//implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//maximize browser window
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Test completed");
    }

    @Test
    public void SignUpTest_Positive() {
        System.out.println("Starting Test");

//open Deens home page
        String url = "https://deens-master.now.sh";
        driver.get(url);
        System.out.println("Open home page");


//click Sign Up button
        WebElement signUpButton = driver.findElement(By.cssSelector("[href='/register']"));
        signUpButton.click();


//enter username
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("randomUser");
        System.out.println("Username is entered");

//enter email
        WebElement emailAddress = driver.findElement(By.cssSelector("#email"));
        emailAddress.sendKeys("randomuser@grr.la");
        System.out.println("Email is entered");

//enter passwords
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("secretPassword");
        System.out.println("Password is entered");

//click Register button
        WebElement registerButton = driver.findElement(By.cssSelector(".green-btn"));
        registerButton.click();

//verifications

        WebElement errorMessage = driver.findElement(By.cssSelector("[class$='message']"));
        Assert.assertTrue(errorMessage.isDisplayed());

    }
}
