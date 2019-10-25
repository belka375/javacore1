package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SignUpPage;

import java.util.concurrent.TimeUnit;


public class PageObjectTests {
    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    @Test
    public void openLandingPage(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
    }
    @Test
    public void loginToApp(){
        var landingPage = new LandingPage(driver);
        landingPage.open();
        landingPage.getLoginButton();
         LoginPage loginPage = landingPage.openLoginPage();
        loginPage.login("smarot100", "Line100$#");

    }
    @Test
    public void signUpToApp(){
        var landingPage = new LandingPage(driver);
        landingPage.open();
        landingPage.getSignUpButton();
        SignUpPage signUpPage = landingPage.openSignUpPage();
        signUpPage.signUp("smarot200", "smarot200@mail.ru", "Line200$#");

    }

}
