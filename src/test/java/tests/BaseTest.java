package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;


public class BaseTest {
    protected WebDriver driver;
    FluentWait<WebDriver> wait;


    @BeforeMethod
  public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchMethodException.class);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }

}
