package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class TestRecord {
    private WebDriver driver;

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void tryToLogin_TryToOpenPage_TitlePageOpen()  {
        System.setProperty("webdriver.chromedriver", "chromdriver");
       driver = new ChromeDriver();
        driver.get(("https://google.com"));
        var title = driver.getTitle();
        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");
        }

            //sleep(7000);
           // driver.quit();

    @Test public void tryToLogin_TryToOpenBing_TitlePageOpen()  {
        System.setProperty("webdriver.chromedriver", "chromdriver");
        driver = new ChromeDriver();
        driver.get(("https://Bing.com"));
        var title = driver.getTitle();
        Assert.assertEquals(title, "Deens, plan my trip!", "Expected title is wrong");
    }




   }


