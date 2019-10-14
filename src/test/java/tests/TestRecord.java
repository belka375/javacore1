package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRecord {
    @Test
    public void tryToLogin_TryToOpenPage_TitlePageOpened() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://bing.com");
        driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys("hello");
        driver.findElement(By.xpath("//*[@id=\"sb_form_go\"]")).click();

        Thread.sleep(7000);
        driver.quit();
    }

}
