package shw10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import java.time.Duration;
public class HWtest {

    public class PageObjectTests {
        WebDriver driver;

        @BeforeMethod
        public void startUp(){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
        }
        @AfterMethod
        public void tearDown() throws InterruptedException{
            Thread.sleep(7000);
            driver.quit();
        }

        @Test
        public void openLoginPage(){
            LandingPage landingPage = new LandingPage(driver);
            landingPage.open();
        }
        @Test
        public void SignUpToApp() throws InterruptedException {
            var landingPage = new LandingPage(driver);
            landingPage.open();
            SignUpPageHw signUpPageHw = LoginPage.openSignUpPageHw();

            signUpPageHw.signUp ("user", "password", "email");
        }

    }
}
