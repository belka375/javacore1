package shw10;

import PageObjects.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.LoginPage;

import java.time.Duration;
import java.util.function.Function;

import static helpers.RandomStringGenerator.randomEmail;
import static helpers.RandomStringGenerator.randomString;

public class Work {
    WebDriver driver;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();



    }
    @AfterTest
    public void tierDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();


    }
    @Test
    public void SignUpPage() {

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        var signUpPage = mainPage.openSignUpPage();
        String username = randomString(10);
        String password = randomString(8);
        String email = randomEmail();

        mainPage = signUpPage.signUpPage(username, email, password);

        Assert.assertTrue(true, "Avatar is Present");
    }
    }


