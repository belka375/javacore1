package HW10.HWtest;

import HW10.HWT.LandingP;
import browserFactory.BrowserFactory;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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

    protected LandingP login(String username, String password) {
        LandingP landingP = new LandingP(driver);
        landingP.openLP();
        var loginPage = landingP.openLoginP();
        return loginPage.login("irina","malysh86");
    }
}
