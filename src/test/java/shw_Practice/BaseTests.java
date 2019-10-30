package shw_Practice;

import DeensPages.MainPage;
import browserFactory.BrowserFactory;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    protected WebDriver driver;
    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
        var factory = new BrowserFactory();
        driver = factory.createWebDriver(BrowserType.CHROME);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    protected MainPage Login(String username, String password) {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        var login = mainPage.openLoginPage();
        return mainPage.login("tell.joshuan@thtt.us","123456789");
    }
}

