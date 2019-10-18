package hw6yp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayDeque;
import java.util.List;

public class Locators {
    private WebDriver driver;

    @BeforeMethod
    public void Startup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }


    @Test
    public void deens_OpenURL_TryToOpenLoginPage_LoginPageOpened() throws InterruptedException {
        driver.get("https://deens-master.now.sh/login");
        var url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://deens-master.now.sh/login");
    }


    @Test
    public void deens_TryToLoginUsingWrongCredentials_LoginFailedErrorMessageAppear() throws InterruptedException {

        driver.get("https://deens-master.now.sh/login");
        var url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://deens-master.now.sh/login");

        WebElement id=driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.xpath("//*[@id='email']/parent::*/parent::*/following-sibling::*/child::*/child::*[1]"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='email']/parent::*/parent::*/following-sibling::*/following-sibling::*"));

        id.sendKeys("email@test.com");
        password.sendKeys("password1");
        Thread.sleep(2000);
        loginButton.click();

        Assert.assertEquals(driver.findElements(By.className("header")).size(), 0);

   }
}

