package tests;

import browserFactory.BrowserFactory;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.LandingPage;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void startUp() throws NoSuchMethodException {

        var factory = new BrowserFactory();
        driver = factory.createWebDriver(BrowserType.CHROME);

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    protected LandingPage logintoApp(String user, String password) {
        var landingPage = new LandingPage(driver);

        landingPage.open();

        //user is redirected to the login page

        var loginPage = landingPage.openLoginPage();

        //fill the field and login
        return loginPage.loginGood("useras", "mailinator");
        //return landingPage;

    }


  }
