package shw6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkSelenium6 {
        private WebDriver driver;

        @BeforeMethod
        public void startUp(){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
        }
        @AfterMethod
        public void tearDown() throws InterruptedException{
            Thread.sleep(7000);
            driver.quit();
        }

        @Test
    public void deens_TryToLoginUsingWrongCredentials_LoginFailedErrorMessageAppear() throws InterruptedException {
            driver.get("https://deens-master.now.sh/");
            Thread.sleep(5000);
            //On My laptop this page open in different style, so i need two steps.
            WebElement LoginButton1 = driver.findElement(By.xpath("//*[@class='MobileHomeNav__Wrap-kjaSWJ eGwaar']"));
            LoginButton1.click();
            Thread.sleep(1000);
            WebElement LoginButton2 = driver.findElement(By.linkText("Login"));
            LoginButton2.click();
            Thread.sleep(4000);
            WebElement id = driver.findElement(By.id("email"));
            WebElement password = driver.findElement(By.xpath("//*[@id='email']/../../following-sibling::*[1]/*/*"));
            WebElement login = driver.findElement(By.xpath("//*[@id='email']/../../following-sibling::*[2]"));
            id.sendKeys("user");
            password.sendKeys("password");
            login.click();
            Thread.sleep(4000);
            Assert.assertTrue(driver.findElements(By.className("content")).size()==1);
        }
}

