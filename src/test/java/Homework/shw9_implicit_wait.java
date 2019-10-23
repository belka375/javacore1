package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class shw9_implicit_wait {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        driver.quit();
    }

    @Test
    public void SignUpUsingCssSelectors_SignupSuccessful(){
        driver.get("https://deens-master.now.sh/");

        WebElement registerButton = driver.findElement(By.cssSelector("a[href='/register']"));
        registerButton.click();

        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("Maria2");

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("marrria2@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("765432ewq");

        WebElement login = driver.findElement(By.cssSelector(".ui.large.fluid.button.green-btn.pl-btn"));
        login.click();

        Assert.assertEquals(driver.findElements(By.className("[class~='Home__Secondary-dyIHIG']")).size(), 0);
    }
}
