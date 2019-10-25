package tests;

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
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SignUpPage;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import static helpers.RandomStringGenerator.randomEmail;
import static helpers.RandomStringGenerator.randomString;

public class PageObjectTests {

    //there e have only tests
    private WebDriver driver;


    @BeforeMethod
    public void sratUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver 2");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        //Thread.sleep(3000);

        driver.quit();
    }

    @Test
    public void clickEarnMoney() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
    }

    @Test
    public void loginToApp() throws InterruptedException {
        //create landing page and give it driver
        var landingPage = new LandingPage(driver);
        //open landing page
        landingPage.open();

        //user is redirected to the login page
        var loginPage = landingPage.openLoginPage();

        //Thread.sleep(3000);
        //fill the field and login
        loginPage.login("user", "passord");
    }

    @Test
    public void registerNewUser_LoggedAsNewUser() {
//        Random randomSelector = new Random();
//        var randomNumber = randomSelector.nextInt(10000);
        var landingPage = new LandingPage(driver);
        //open landing page
        landingPage.open();

        //user is redirected to the sign up page
        var signUpPage = landingPage.openSignUpPage();

        //generate ramdon user and email
        String username = randomString(10);
        String password = randomString(12);
        String email = randomEmail();

        landingPage = signUpPage.registerNewUser(username, email, password);

        //fill the fields on the shign up page

        //   signUpPage.signUp("user"+randomNumber,"email"+randomNumber+"@mailinator.com","password21");

        // asser that we are loged
        var logged = landingPage.isLogged();
        //verify that we have avatar at the page is true

        Assert.assertTrue(logged);


    }

    @Test
    public void liginUser_copyReferralLink() throws IOException, UnsupportedFlavorException {
        var landingPage = new LandingPage(driver);

        landingPage.open();

        //user is redirected to the login page

        var loginPage = landingPage.openLoginPage();

        //fill the field and login
        loginPage.loginGood("user", "password");
        var logged = landingPage.isLogged();
        Assert.assertTrue(logged);

        var earnMoneyPage = landingPage.openEarnMoneyPage();



    }
}


