package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestRecord {
    private WebDriver driver;

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();

    }

    @Test
    public void tryToLogin_TryToOpenPage_TitlePageOpened()  {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        driver.get("https://deens-master.now.sh/");
        var title = driver.getTitle();
        Assert.assertEquals(title, "Deens, plan my trip!", "Expexted titile is wrong!");

    }
}
