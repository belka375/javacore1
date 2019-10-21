package hw9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpImplicitWait {
    private WebDriver driver;

    @BeforeMethod
    public void deensSignUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void deens_signUp_signUpSuccessful() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        driver.findElement(By.cssSelector("[href='/register']")).click();
        driver.findElement(By.cssSelector("#username")).sendKeys("testkamoh");
        driver.findElement(By.cssSelector("#email")).sendKeys("kamoh@net2mail.top");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456789");
        driver.findElement(By.cssSelector(".pl-btn")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[alt='user avatar']")).isEnabled());
    }
}
