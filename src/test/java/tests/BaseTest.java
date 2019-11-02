package tests;

import browserFactory.BrowserFactory;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.LandingPage;

public class BaseTest {
    WebDriver driver;
        @BeforeMethod
        public void startUp() throws NoSuchMethodException {
            var factory = new BrowserFactory();
            driver = factory.createWebDriver(BrowserType.CHROME);
            driver.manage().window().maximize();
        }
        @AfterMethod
        public void tearDown() throws InterruptedException{
            Thread.sleep(1000);
            driver.quit();
    }

    protected LandingPage loginToApp(String username, String password) {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
        var loginPage = landingPage.openLoginPage();
        return loginPage.login("smarot10","Password_10");
    }
}
