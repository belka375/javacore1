package HomeworkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class TestEarnMoneyCode {

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


    @Test
    public void testReferralCode_EarnMoneyPage() throws InterruptedException, IOException, UnsupportedFlavorException {

        HomePage homePage = new HomePage(driver);
        homePage.open();
        Thread.sleep(3000);
        var logInPage = homePage.openLoginPage();
        homePage=logInPage.login("tanik10", "password");
        homePage.worldImgDisplayed();
        homePage.assertAvatar();
        var earnMoneyPage = homePage.openEarnMoneyPage();
        Thread.sleep(4000);
        System.out.println("opened Earn Money Page");
        var codeInputField = earnMoneyPage.getCode();
        System.out.println("Code from Input = " + codeInputField);
        earnMoneyPage.getCopyReferralCodeButton().click();
        var codeClipboard = earnMoneyPage.getCopiedCode();
        System.out.println("Code from clipboard = " + codeClipboard);
        var codeMatch = earnMoneyPage.compareCodes(codeClipboard, codeInputField);
        Assert.assertTrue(codeMatch);
    }
}
