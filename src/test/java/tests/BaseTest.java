package tests;

import browserFactory.BrowserFactory;
import enums.BrowserType;
import helpers.GetScreenshot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pageObjects.LandingPage;

import java.lang.reflect.Method;


public class BaseTest {
    WebDriver driver;
    protected Logger logger;
    @BeforeMethod
    @Parameters({"browser"})
    public void startUp(String browserName) throws NoSuchMethodException {
        logger = LogManager.getLogger();
        var factory = new BrowserFactory();
        BrowserType browserType;
        switch (browserName){
            case "FIREFOX": browserType = BrowserType.FIREFOX;
            break;
            case "CHROME": browserType =BrowserType.CHROME;
            break;
            default: throw new NoSuchFieldError(" NO such browser ");
        }
        driver = factory.createWebDriver(browserType);
    }
    @AfterMethod
    public void tearDown(ITestResult result){
        if(result.getStatus()==ITestResult.FAILURE){
            GetScreenshot.capture(driver, result.getName());

            logger.error("Test "+result.getName()+ " failed with status "+result.getStatus());
        }
        driver.quit();
    }

    protected LandingPage loginToApp(String username, String password) {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
        var loginPage = landingPage.openLoginPage();
        return loginPage.login("smarot10","Password_10");
    }
}
