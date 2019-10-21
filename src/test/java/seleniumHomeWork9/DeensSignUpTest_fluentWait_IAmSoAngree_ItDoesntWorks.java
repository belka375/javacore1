package seleniumHomeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

public class DeensSignUpTest_fluentWait_IAmSoAngree_ItDoesntWorks {
    private WebDriver driver;
    private Wait<WebDriver> fluentWait;


    @BeforeMethod
//create driver
    public void startUp() {
        System.setProperty("wbdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
//fluent wait
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
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


//fluent wait
//        fluentWait.until(x -> x.findElement(By.xpath("//*[@href='/register']")).isEnabled());
//click Sign Up button
        WebElement signUpButton = driver.findElement(By.xpath("//*[@href='/register']"));
        signUpButton.click();


//fluent wait
//        fluentWait.until(x -> x.findElement(By.xpath("//*[@id='username']")).isDisplayed());
//enter username
        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        username.sendKeys("randomUser");
        System.out.println("Username is entered");

//enter email
        WebElement emailAddress = driver.findElement(By.xpath("//*[@id='email']"));
        emailAddress.sendKeys("randomuser@grr.la");
        System.out.println("Email is entered");

//enter passwords
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secretPassword");
        System.out.println("Password is entered");


//click Register button
        WebElement registerButton = driver.findElement(By.xpath("//button[@class]"));
        registerButton.click();


//verifications
//        fluentWait.until(x -> x.findElement(By.xpath("//*[contains(text(),'This email')]")).isDisplayed());

        WebElement errorMessage = driver.findElement(By.xpath("//*[contains(text(),'This email')]"));
        Assert.assertTrue(errorMessage.isDisplayed());

    }
}
