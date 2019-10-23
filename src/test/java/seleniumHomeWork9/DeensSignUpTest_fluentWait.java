package seleniumHomeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class DeensSignUpTest_fluentWait {
    private WebDriver driver;
    private Wait<WebDriver> fluentWait;

    @BeforeMethod
//create driver
    public void startUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		driver = new FirefoxDriver();
//fluent wait
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(Exception.class);

//maximize browser window
        driver.manage().window().maximize();
    }

    @Test
    public void SignUpTest_Positive() {
        Random randomSelector = new Random();
        var randomNumber = randomSelector.nextInt(10000);
        System.out.println("Starting Test");

//open Deens home page
        driver.get("https://deens-master.now.sh");
        System.out.println("Open home page");
//fluent wait
        fluentWait.until(x -> x.findElement(By.xpath("//*[@href='/register']")));

//click Sign Up button
        WebElement signUpButton = driver.findElement(By.xpath("//*[@href='/register']"));
        signUpButton.click();

//fluent wait
        fluentWait.until(x -> driver.findElement(By.xpath("//*[@id='username']")).isEnabled());
//enter username
        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        username.sendKeys("randomUser" + randomNumber);
        System.out.println("Username is entered");

//enter email
        WebElement emailAddress = driver.findElement(By.xpath("//*[@id='email']"));
        emailAddress.sendKeys("randomuser" + randomNumber + "@grr.la");
        System.out.println("Email is entered");

//enter passwords
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("secretPassword");
        System.out.println("Password is entered");

//click Register button
        WebElement registerButton = driver.findElement(By.xpath("//button[@class]"));
        registerButton.click();

//verifications
        fluentWait.until(x -> driver.findElement(By.cssSelector("[role='listbox']")));
        WebElement userAvatarButton = driver.findElement(By.xpath("//*[@role='listbox']/div[1]"));
        Assert.assertTrue(userAvatarButton.isDisplayed(), "User avatar button is not displayed");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Test completed");
    }
}
