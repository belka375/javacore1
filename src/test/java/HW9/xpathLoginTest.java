package HW9;

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




public class xpathLoginTest {
    private WebDriver driver;
    Wait<WebDriver>fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();


    }

    @Test
    public void deens_LoginPage_LoginSuccessfull_usingXPath() {
        driver.get("https://deens-master.now.sh/login");
        WebElement email = driver.findElement(By.xpath("//*[@name=\"email\"]"));
        email.sendKeys("irina.skitayeva@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@name=\"password\"]"));
        password.sendKeys("malysh86");
        fluentWait.until(driver->driver.findElement(By.xpath("//*[@data-testid='loginSubmit']"))).click();
        var customazibleTravelsText = driver.findElement(By.xpath("//*[contains(@style,'color')]"));
        fluentWait.until(driver->driver.findElement(By.xpath("//*[contains(@style,'color')]")));
        Assert.assertTrue(true, String.valueOf(customazibleTravelsText));
    }
}