package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class TestRecord {
    @Test
    public void tryToLogin_TryToOpenPage_TitlePageOpen() throws InterruptedException {
        System.setProperty("webdriver.chromedriver","chromdriver");
        WebDriver driver = new ChromeDriver();
        driver.get(("http://bing.com"));


        sleep(7000);
        driver.quit();
    }
}
