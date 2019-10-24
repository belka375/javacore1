package shw10;
//*Write test, using Page Object Model
//*Site https://deens-master.now.sh/
//*workflow -> Sign up:
//*a. Open Sign Up page,
//*b. fill fields
//*c. Sign up to the site
//*d. Assert
//*(Create new class SignUpPage)
//*Collapse

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;

public class PageObjectTests {
    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }

    @Test

    public void singUpToApp_Successful() throws InterruptedException {
        var landingPage = new LandingPage(driver);
        landingPage.openPage();
        SignUpPage signupPage = landingPage.openSignUpPage();
        String email = "name" + signupPage.randomInt()+"@mail.com";
        String password = "XXXXX" + signupPage.randomInt();
        signupPage.signup("name", email, password);

        Assert.assertTrue(driver.findElement(By.cssSelector("[src='/world.png']")).isDisplayed());
    }
}




