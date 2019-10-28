package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static helpers.RandomStringGenerator.randomEmail;
import static helpers.RandomStringGenerator.randomString;

public class SecondLine extends BaseTest {
    @Test
    public void second_getReferenceCode() throws IOException, UnsupportedFlavorException, InterruptedException {
        var landingPage = loginToApp("smarot10","Password_10");
        Thread.sleep(3000);
        var earnMoney = landingPage.openEarnMoneyPage();
        var textFromField = earnMoney.getCodeField().getAttribute("value");
        var textFromClipboard = earnMoney.getTextFromClipboard().split("=")[1];

        Assert.assertEquals(textFromField,textFromClipboard);
//        Assert.assertEquals("https://deens-master.now.sh/register?ref="+textFromField,textFromClipboard);
    }

    @Test
    public void second_openLandingPage(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
    }
    @Test(retryAnalyzer = listeners.RetryAnalyzer.class)
    public void second_loginToApp() throws InterruptedException {
        var landingPage = new LandingPage(driver);
        landingPage.open();
        var loginPage = landingPage.openLoginPage();

        loginPage.login("user","password");
    }
    @Test
    public void second_registerNewUser_LoggedAsNewUser(){

        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();

        var signUpPage = landingPage.openSingUpPage();

        String username = randomString(10);
        String password = randomString(12);
        String email = randomEmail();

        landingPage = signUpPage.registerNewUser(username,email,password);
        var logged = landingPage.isLogged();

        Assert.assertTrue(logged);
    }
}
