package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumHomeWork10.LandingPageHW10;

public class SignUpTestHW10 {
    WebDriver driver;

    @BeforeMethod
    public void sturtUp() {
        System.setProperty("webdriver.driver.chromedriver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void signUpTest() {
        var landingPage = new LandingPageHW10(driver);
        landingPage.open();
        var signUpPage = landingPage.openSignUpPage();
        signUpPage.signUp("newUser", "newEmail", "newPassword");

        var logged = landingPage.isLogged();
        Assert.assertTrue(logged);
    }
}

