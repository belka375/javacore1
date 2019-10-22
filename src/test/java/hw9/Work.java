package hw9;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Work {

    Wait<WebDriver> fluentWait;
    WebDriverWait wait;
    private WebDriver driver;

    @BeforeTest

    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);

        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(70))
                .ignoring(NoSuchElementException.class);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterTest

    public void tierDown() throws InterruptedException {
        driver.quit();


    }

    @Test

    public void tryToRegister_RegisterSuccesfull() {

        driver.get("https://deens-master.now.sh/");

        fluentWait.until(driver -> driver.findElement(By.cssSelector("[href='/register']")).isEnabled());
        WebElement login = driver.findElement(By.cssSelector("[href='/register']"));

        login.click();

        fluentWait.until(driver -> driver.findElement(By.cssSelector("#username")).isEnabled());
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("Tatiana13");

        fluentWait.until(driver -> driver.findElement(By.cssSelector("#email")).isEnabled());
        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("t13@gmail.com");

        fluentWait.until(driver -> driver.findElement(By.cssSelector("#password")).isEnabled());
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("Tatiana13");

        fluentWait.until(driver -> driver.findElement(By.cssSelector(".pl-btn")).isEnabled());
        WebElement register = driver.findElement(By.cssSelector(".pl-btn"));
        register.click();

        WebElement image = driver.findElement(By.cssSelector("[data-src='/world.png]"));

        Assert.assertTrue(image.isDisplayed());


    }

    @Test

    public void tryToRegister_RegisterSuccesfull_XPath() {

        driver.get("https://deens-master.now.sh/");


        WebElement login = driver.findElement(By.cssSelector("[href='/register']"));
        login.click();


        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("Tatiana13");

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("t13@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("Tatiana13");

        WebElement register = driver.findElement(By.cssSelector(".pl-btn"));
        register.click();


        WebElement createTrip = driver.findElement(By.cssSelector("[href = '/new/trip']"));
        createTrip.click();

    }
}

