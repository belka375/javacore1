package tests;

import browserFactory.BrowserFactory;
import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class BasePageObject {
    WebDriver driver;

    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
       var fabric = new BrowserFactory();
       driver = fabric.createWebDriver(BrowserType.CHROME);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
