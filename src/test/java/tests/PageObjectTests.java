package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.time.Duration;

import static helpers.RandomStringGenerator.randomEmail;
import static helpers.RandomStringGenerator.randomString;

public class PageObjectTests {
    WebDriver driver;

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
    public void openLandingPage(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
    }
    @Test
    public void loginToApp() throws InterruptedException {
        var landingPage = new LandingPage(driver);
        landingPage.open();
        var loginPage = landingPage.openLoginPage();

        loginPage.login("user","password");
    }
    @Test
    public void registerNewUser_LoggedAsNewUser(){

        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();

        var signUpPage = landingPage.openSingUpPage();

        String username = randomString(10);
        String password = randomString(12);
        String email = randomEmail();

        landingPage = signUpPage.registerNewUser(username,email,password);
        var logged = landingPage.isLogged();

        Assert.assertTrue(logged);
    }
}
