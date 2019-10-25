package shw10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import shw10.helpers.GetStringFromClipboard;
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

        @Test
        public void openSignUpPageAndSignUpWithRandomCredentials(){
            var landingPage = new LandingPage(driver);
            landingPage.open();
            SignUpPage signUpPage = landingPage.openSignUpPage();
            signUpPage.loginWithRandomCredantials(8, 8,8);
            signUpPage.assertlogin();
        }

        @Test
        //FIXME Make Code Nice Again
        public void loginInOpenEarnMoneyPage() throws Exception {
            var landingPage = new LandingPage(driver);
            landingPage.open();
            var loginPage = landingPage.openLoginPage();
            landingPage = loginPage.loginManualInput("prostotest", "prostotest");
            var earnMoneyPage = landingPage.openEarnMoneyPage();
            //String va = ClipboardAccess.readClipboard(earnMoneyPage.getReferralCode().getAttribute("value"));
            earnMoneyPage.referal();
            GetStringFromClipboard.ololo();
            Assert.assertEquals(driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/main/div[1]/div/div/div/div/div[1]/div/input")).getAttribute("value"),GetStringFromClipboard.ololo());
            //String va = Toolkit.getDefaultToolkit().getSystemClipboard();


        }

/*    автоматизировать на сайте https://deens-master.now.sh/
    workflow -> Landing Page -> Login Page ->Earn Money Page:
    а. скопировать в клипбоард референсный код
    б. ассерт что код в памяти тот же что и в поле*/

}
