package seleniumHomeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class DeensSignUpTest_explicitWait {
    private WebDriver driver;


    @BeforeMethod
//create driver
    public void startUp() {
        System.setProperty("wbdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

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
        driver.get("https://deens-master.now.sh");
        System.out.println("Open home page");

//explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 7);


//click Sign Up button
        WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@href='/register']")));
        signUpButton.click();

        //explicit wait
        WebDriverWait wait2 = new WebDriverWait(driver, 7);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='username']")));

//enter username
        Random randomSelector = new Random();
        var randomNumber = randomSelector.nextInt(10000);
        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        username.sendKeys("randomUser"+randomNumber);
        System.out.println("Username is entered");

//enter email
        WebElement emailAddress = driver.findElement(By.xpath("//*[@id='email']"));
        emailAddress.sendKeys("randomuser" +randomNumber+"@grr.la");
        System.out.println("Email is entered");

//enter passwords
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secretPassword");
        System.out.println("Password is entered");


//click Register button
        WebElement registerButton = driver.findElement(By.xpath("//button[@class]"));
        registerButton.click();


//verifications
        //explicit wait
        WebDriverWait wait3 = new WebDriverWait(driver, 7);
        Assert.assertTrue(wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@role='listbox']/div[1]"))).isEnabled(), "User avatar button is not visible");

    }
}

