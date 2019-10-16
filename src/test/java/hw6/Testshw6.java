package hw6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Testshw6 {

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
        public void deens_TryToLoginUsingWrongCredentials_LoginFailedErrorMessageAppear() throws InterruptedException {
            driver.get("https://deens-master.now.sh/");
            Thread.sleep(5000);
            WebElement loginButton = driver.findElement(By.linkText("Login"));
            loginButton.click();

            Thread.sleep(4000);

            WebElement id = driver.findElement(By.xpath("//*[@id='email']"));
            WebElement password = driver.findElement(By.xpath("//*[@id='email']/parent::*/parent::*/following-sibling::*/*/input"));
            WebElement login = driver.findElement(By.xpath("//*[@id='email']/parent::*/parent::*/following-sibling::*/following-sibling::*"));

            id.sendKeys("user");
            password.sendKeys("password");
            login.click();

            Thread.sleep(3000);

            Assert.assertTrue(driver.findElements(By.className("header")).size() != 0);

        }
    }















