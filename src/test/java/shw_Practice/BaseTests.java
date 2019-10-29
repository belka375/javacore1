package shw_Practice;

import DeensPages.MainPage;
import browserFactory.BrowserFactory;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    protected WebDriver driver;
    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
        var factory = new BrowserFactory();
        driver = factory.createWebDriver(BrowserType.CHROME);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        driver.quit();
    }
    protected MainPage Login(String username, String password) {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        var login = mainPage.openLoginPage();
        return mainPage.login("tell.joshuan@thtt.us","123456789");
    }
}

