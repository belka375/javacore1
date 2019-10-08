package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRecord {
    @Test
    public void tryToLogin_TryToOpenPage_TitlePageOpened() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver 2");

        WebDriver driver = new ChromeDriver();

        //open the page

        driver.get("https://bing.com");

        // stop the process on 7 seconds

        Thread.sleep(7000);
        //destroi the browser

        driver.quit();




    }
}
