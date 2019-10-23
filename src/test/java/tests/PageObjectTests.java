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

import java.time.Duration;
import java.util.Random;

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

        driver.quit();
    }

    @Test
    public void clickEarnMoney(){
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
        LoginPage loginPage = landingPage.openLoginPage();

        //Thread.sleep(3000);
        //fill the field and login
        loginPage.login("user","passord");
    }
    @Test
    public void signUpToApp(){
        Random randomSelector = new Random();
        var randomNumber = randomSelector.nextInt(10000);
        var landingPage = new LandingPage(driver);
        //open landing page
        landingPage.open();

        //user is redirected to the login page
        SignUpPage signUpPage = landingPage.openSignUpPage();

        //fill the fields on the shign up page

        signUpPage.signUp("user"+randomNumber,"email"+randomNumber+"@mailinator.com","passord21");


        Assert.assertTrue(driver.findElements(By.xpath("//*[@role='listbox']")).size() != 0);
        Assert.assertEquals(driver.getCurrentUrl(), "https://deens-master.now.sh/");
    }
}


