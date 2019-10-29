package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestHomeWork {
    WebDriver driver;


    @BeforeMethod
    public void sturtUp() {
        System.setProperty("webdriver.driver.chromedriver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Starting test");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Test completed");
    }

}
