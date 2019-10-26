package tests;

import helpers.GetStringFromClipboard;
import homeWork11_pageObjects_Deens.LandingPageHW11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork11_EarnMoney_ReferralCode_Test {
    WebDriver driver;

    @BeforeMethod
    public void sturtUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void logIn_MoveToEarnMoneyPage_CopyReferralCode() throws Exception {
        //open home page
        var landingPage = new LandingPageHW11(driver);
        landingPage.open();

        //click LogIn button ->get to login page
        var loginPage = landingPage.openLoginPage();
        //put credentials ->click login button
        loginPage.login("randomuser5327@grr.la", "secretPassword");
        var logged = landingPage.isLogged();
        Assert.assertTrue(logged);
        //click Earn Money button->open earn money page
        var earnMoneyPage = landingPage.openEarnMoneyPage(driver);
        //copy referral code from clipboard field
        var codeFromInputField = earnMoneyPage.referralCodeField().getAttribute("value");
        earnMoneyPage.referralCodeField();
        earnMoneyPage.copyReferralCode();
        GetStringFromClipboard.copyString();

        Assert.assertEquals("https://deens-master.now.sh/register?ref=" + codeFromInputField, GetStringFromClipboard.copyString());
        System.out.println("Test completed");
    }
}



