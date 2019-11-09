package finalProject;

import browserFactory.BrowserFactory;
import enums.BrowserType;
import helpers.GetScreenshot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pageObjects.LandingPage;

public class BasicTest {
//    WebDriver driver;
//
//    @BeforeMethod
//    @Parameters({"browser"})
//    public void startUp(String browserName) throws NoSuchMethodException, NoSuchFieldError {
//
//        BrowserType browserType;
//        switch (browserName){
//            case "FIREFOX": browserType = BrowserType.FIREFOX;
//                break;
//            case "CHROME": browserType = BrowserType.CHROME;
//                break;
//            default: throw new NoSuchFieldError(" NO such browser ");
//        }
//        var factory = new BrowserFactory();
//        driver = factory.createWebDriver(browserType);
//        driver.manage().window().maximize();
//    }
//    @AfterMethod
//    public void tearDown(ITestResult result) throws InterruptedException{
//        if(result.getStatus()==ITestResult.FAILURE){
//            GetScreenshot.capture(driver, result.getName());
//        }
//
//        Thread.sleep(1000);
//        driver.quit();
//    }

    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
//        Thread.sleep(500);
        driver.quit();
    }

}
