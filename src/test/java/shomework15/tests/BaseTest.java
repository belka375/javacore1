package shomework15.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import shomework15.browserFactory.BrowserFactory;
import shomework15.enums.BrowserType;
import shomework15.pageObjects.LandingPage;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void StartUp() throws NoSuchMethodException {
        var factory = new BrowserFactory();
        driver = factory.createWebDriver(BrowserType.FIREFOX);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    protected LandingPage loginToApp(String username, String password) {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
        var loginPage = landingPage.openLoginPage();
        return loginPage.login("dinabestom", "#####___");
    }
}

