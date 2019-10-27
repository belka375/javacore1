package sel_hw11yp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class TestReferralCode {
    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
//        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void login_GoToEarnMoney_CopyReferralCode_AssertCodeInClipboard() throws Exception {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
        Thread.sleep(3000);
        var loginPage = landingPage.openLoginPage();
        landingPage = loginPage.login("testuser7@gmail.com", "testuser7");
        var logged = landingPage.isLogged();
        Assert.assertTrue(logged);

        var earnMoneyPage = landingPage.openEarnMoneyPage(driver);
        System.out.println("Earn Money page is opened");
        //copy referral code from clipboard field
        var codeFromInputField = earnMoneyPage.codeField().getAttribute("value");
        earnMoneyPage.codeField();
        earnMoneyPage.copyReferralCode();
        GetStringFromClipboard.copyString();

        Assert.assertEquals("https://deens-master.now.sh/register?ref=" + codeFromInputField, GetStringFromClipboard.copyString());

        System.out.println("Code from Input field = " + codeFromInputField);
        earnMoneyPage.getCopyCodeButton().click();
        var codeClipboard = earnMoneyPage.getTextFromClipboard();
        System.out.println("Code from clipboard is copied");

//        var codeMatch = earnMoneyPage.compareCodes(codeClipboard, codeFromInputField);
//        Assert.assertTrue(codeMatch);
    }
}
