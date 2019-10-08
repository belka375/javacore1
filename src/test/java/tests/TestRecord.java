package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRecord {
    @Test
    public void tryToLogin_TryToOpenPage_TitlePageOpened() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://bing.com");

        Thread.sleep(7000);
        driver.quit();
    }

}
