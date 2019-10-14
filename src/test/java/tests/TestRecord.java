package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRecord {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void openUrl_TryToOpenDeens_GoogleOpened()  {
        driver.get("https://google.com/");
        var title = driver.getTitle();
        Assert.assertEquals(title,"Deens, plan my trip!", "Expected title is wrong");
    }

    @Test
    public void openUrl_TryToOpenDeens_BingOpened(){
        driver.get("https://Bing.com/");
        var title = driver.getTitle();
        Assert.assertEquals(title,"Deens, plan my trip!", "Expected title is wrong");
    }


    @Test
    public void openUrl_TryToOpenDeens_DeensOpened(){
        driver.get("https://deens-master.now.sh/");
        var title = driver.getTitle();
        Assert.assertEquals(title,"Deens, plan my trip!", "Expected title is wrong");
    }

    @Test
    public void openUrl_TryToOpenDeensCheckUrl_DeensOpened(){
        driver.get("https://deens-master.now.sh/");
      var url = driver.getCurrentUrl();
       Assert.assertEquals(url,"https://deens-master.now.sh/", "Expected URL is wrong");

    }

}
