package shomework9;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestRecord {
    private WebDriver driver;
    Wait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_SignUpUsingCssSelectors_SignUpSuccessful() {
        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(1000);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://deens-master.now.sh/");

        driver.findElement(By.cssSelector("[href='/register']")).click();

        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.clear();
        username.sendKeys("username" + randomNumber);

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.clear();
        email.sendKeys("username" + randomNumber + "@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.clear();
        password.sendKeys(randomNumber + "#####_____");

        driver.findElement(By.cssSelector(".pl-btn")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("[src='/world.png']")).isDisplayed());
    }

    @Test
    public void deens_SignUpUsingXpath_SignUpSuccessful() {
        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(1000);

        driver.get("https://deens-master.now.sh/");

        WebElement signUpButton = driver.findElement(By.xpath("//*[@href='/register']"));
        fluentWait.until(x -> signUpButton.isEnabled());
        signUpButton.click();

        fluentWait.until(x -> x.findElement(By.xpath("//*[@id='username']")).isEnabled());
        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        username.clear();
        username.sendKeys("username" + randomNumber);

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.clear();
        email.sendKeys("username" + randomNumber + "@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.clear();
        password.sendKeys(randomNumber + "#####_____");

        WebElement register= driver.findElement(By.xpath("//*[text()='Register']"));
        register.click();

        fluentWait.until(x -> x.findElement(By.xpath("//*[@src='/world.png']")).isDisplayed());
        WebElement worldImage=driver.findElement(By.xpath("//*[@src='/world.png']"));
        Assert.assertTrue(worldImage.isDisplayed());

    }
}
