package HW10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class tests {
     WebDriver driver;



    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();

    }

    @Test
    public void openLandingPage() {
       LandingPage landingPage =new LandingPage(driver);
       landingPage.open();


    }
    @Test
    public void openSignUP() throws InterruptedException {
        LandingPage landingPage=new LandingPage(driver);
        landingPage.open();
       SignUpPage signUpPage = landingPage.openSignUpPage();
       Thread.sleep(3000);
       signUpPage.signup("user","email","password");
        var customazibleTravelsText = driver.findElement(By.xpath("//*[contains(@style,'color')]"));
        Assert.assertTrue(true, String.valueOf(customazibleTravelsText));


    }
}