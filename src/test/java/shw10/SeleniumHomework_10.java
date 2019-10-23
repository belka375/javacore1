package shw10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import shw10.pageObjects.LandingPage;
import shw10.pageObjects.SignUpPage;

public class SeleniumHomework_10 {
        WebDriver driver;

        @BeforeMethod
        public void startUp(){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        @AfterMethod
        public void tearDown() throws InterruptedException{
            Thread.sleep(3000);
            driver.quit();
        }

/*        @Test
        public void openLoginPage(){
            LandingPage landingPage = new LandingPage(driver);
            landingPage.open();
        }
        @Test
        public void loginToApp() throws InterruptedException {
            var landingPage = new LandingPage(driver);
            landingPage.open();
            LoginPage loginPage = landingPage.openLoginPage();
            loginPage.loginManualInput("User","Password");
        }*/

        @Test
        public void openSignUpPageAndSignUpWithRandomCredentials(){
            var landingPage = new LandingPage(driver);
            landingPage.open();
            SignUpPage signUpPage = landingPage.openSignUpPage();
            signUpPage.loginWithRandomCredantials(8, 8,8);
            signUpPage.assertlogin();
        }
}
