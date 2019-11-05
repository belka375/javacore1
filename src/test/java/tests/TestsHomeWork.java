package tests;

import helpers.GetStringFromClipboard;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsHomeWork.LandingPageHomeWorkHomeWork;
import pageObjectsHomeWork.SearchPageHomeWorkHomeWork;

import static helpers.CreatingRandomUserCredentials.*;

public class TestsHomeWork extends BaseTest {


    @Test
    public void logInTest() throws Exception {
        var landingPage = new LandingPageHomeWorkHomeWork(driver);
        landingPage.openTestingPage();
        var logInPage = landingPage.openLogInPage();
        logInPage = landingPage.openLogInPage();
        logInPage.logInRegisteredUser("randomuser5327@grr.la", "secretPassword");
        var loggedInUser = landingPage.isLogged();
        Assert.assertTrue(loggedInUser, "User is not logged in!");


    }

    @Test
    public void sigUpTest() {
        LandingPageHomeWorkHomeWork landingPage = new LandingPageHomeWorkHomeWork(driver);
        landingPage.openTestingPage();

        var signUpPage = landingPage.openSignUpPageHomeWork();

        String username = randomUsername();
        String userEmail = randomEmail();
        String userPassword = randomPassword();
        landingPage = signUpPage.signUpNewUser(randomUsername(), randomEmail(), randomPassword());


        var registeredUser = landingPage.isRegistered();
        Assert.assertTrue(registeredUser, "User is not registered!");

    }


    @Test
    public void logIn_MoveToEarnMoneyPage_CopyReferralCode() throws Exception {
        LandingPageHomeWorkHomeWork landingPage = new LandingPageHomeWorkHomeWork(driver);
        landingPage.openTestingPage();

        var loginPage = landingPage.openLogInPage();
        loginPage.logInRegisteredUser("randomuser5327@grr.la", "secretPassword");
        var loggedInUser = landingPage.isLogged();
        Assert.assertTrue(loggedInUser, "User is not logged in!");

        var earnMoneyPage = landingPage.openEarnMoneyPage(driver);

        var codeFromInputField = earnMoneyPage.referralCodeField().getAttribute("value");
        earnMoneyPage.copyReferralCode();
        earnMoneyPage.copyReferralCode();
        GetStringFromClipboard.copyString();

        Assert.assertEquals("https://deens-master.now.sh/register?ref=" + codeFromInputField, GetStringFromClipboard.copyString());

    }

    // Home Work 13
    @Test
    public void searchForNewYorkTripTest() {
        var landingPage = new LandingPageHomeWorkHomeWork(driver);
        landingPage.openTestingPage();
        SearchPageHomeWorkHomeWork searchPage = landingPage.openSearchPage("New York");
        var results = searchPage.getTrips();
        Assert.assertEquals(results.size(), 6);
    }

    // Home Work 14
    @Test
    public void scrollDown_clickCreateTripButton() {
        LandingPageHomeWorkHomeWork landingPage = new LandingPageHomeWorkHomeWork(driver);
        landingPage.openTestingPage();
        landingPage.scrollDownPage();
        var message = landingPage.messageDisplayed();
        Assert.assertTrue(message, "Pop up message with text 'Where do you want to go?' is not visible");
    }

    //Home Work 15
    @Test
    public void hoverOverOnLoginButton_AssertColorChenging_Test(){
        LandingPageHomeWorkHomeWork landingPage = new LandingPageHomeWorkHomeWork(driver);
        landingPage.openTestingPage();
        landingPage.hoverOverLoginButton();
        var loginButtonOtherColor = landingPage.loginButtonWithChengedColor();
        Assert.assertTrue(loginButtonOtherColor, "LogIn button didn't change it color");
    }
}

