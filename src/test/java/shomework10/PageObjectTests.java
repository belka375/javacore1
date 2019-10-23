package shomework10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PageObjectTests {
    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test

    public void singUpToApp_Successful() throws InterruptedException {
        var landingPage = new LandingPage(driver);
        landingPage.openPage();
        SignUpPage signupPage = landingPage.openSignUpPage();
        String email = "username" + signupPage.randomInt()+"@gmail.com";
        String password = "####____" + signupPage.randomInt();
        signupPage.signup("username", email, password);

        Assert.assertTrue(driver.findElement(By.cssSelector("[src='/world.png']")).isDisplayed());
    }
}