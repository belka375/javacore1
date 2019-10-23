package Homework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class shw9_fluent_wait {
    private WebDriver driver;
    Wait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        driver.quit();
    }


    @Test
    public void deens_SignUpUsingXpathSelectors_SignupSuccessful() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");

        fluentWait.until(x->driver.findElement(By.xpath("//*[@href='/register']")).isEnabled());
        driver.findElement(By.xpath("//*[@href='/register']")).click();

        fluentWait.until(x->driver.findElement(By.xpath("//*[@id='username']")).isDisplayed());
        WebElement username = driver.findElement(By.xpath("//*[@id='username']"));
        username.sendKeys("Ivan1");

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("Ivan9999@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("1234567qwe");

        WebElement register = driver.findElement(By.xpath("//button[contains(.,'Register')]"));
        register.click();

        fluentWait.until(x->driver.findElement(By.xpath("//*[contains(@class, 'Home__HomeTagLine')]")));

        Assert.assertEquals(driver.findElements(By.xpath("//*[contains(@class, 'Home__HomeTagLine')]")).size(), 1);
    }

}
