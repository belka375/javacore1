import browsersFactory.BrowsersFactory;
import enumsPackage.BrowsersTypes;
import myhelpers.GetScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sel_hw13.LandingPage;

public class BaseTestS {
    WebDriver driver;
    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
        var factory = new BrowsersFactory();
        driver = factory.createWebDriver(BrowsersTypes.CHROME);
    }
    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException{
        if(result.getStatus()==ITestResult.FAILURE){
            GetScreenshots.capture (driver, result.getName());
        }

        Thread.sleep(7000);
        driver.quit();
    }

    protected LandingPage loginToApp(String username, String password) {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
        var loginPage = landingPage.openLoginPage();
        return loginPage.login("testuser7@gmail.com","testuser7");
    }
}
