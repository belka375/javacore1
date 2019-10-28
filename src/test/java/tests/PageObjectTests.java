package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import static helpers.RandomStringGenerator.randomEmail;
import static helpers.RandomStringGenerator.randomString;

public class PageObjectTests extends BaseTest {

    @Test
    public void clickEarnMoney() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
    }

    @Test
    public void loginToApp() throws InterruptedException {
        //create landing page and give it driver
        var landingPage = new LandingPage(driver);
        //open landing page
        landingPage.open();

        //user is redirected to the login page
        var loginPage = landingPage.openLoginPage();

        //Thread.sleep(3000);
        //fill the field and login
        loginPage.login("user", "passord");
    }

    @Test
    public void registerNewUser_LoggedAsNewUser() {
//        Random randomSelector = new Random();
//        var randomNumber = randomSelector.nextInt(10000);
        var landingPage = new LandingPage(driver);
        //open landing page
        landingPage.open();

        //user is redirected to the sign up page
        var signUpPage = landingPage.openSignUpPage();

        //generate ramdon user and email
        String username = randomString(10);
        String password = randomString(12);
        String email = randomEmail();

        landingPage = signUpPage.registerNewUser(username, email, password);

        //fill the fields on the shign up page

        //   signUpPage.signUp("user"+randomNumber,"email"+randomNumber+"@mailinator.com","password21");

        // asser that we are loged
        var logged = landingPage.isLogged();
        //verify that we have avatar at the page is true

        Assert.assertTrue(logged);


    }

    @Test
    public void loginUser_copyReferralLink() throws IOException, UnsupportedFlavorException {
        var landingPage = logintoApp("useras","mailinator");

        Assert.assertTrue(landingPage.isLogged());

        //open page Earn money

        var earnMoneyPage = landingPage.openEarnMoneyPage();

        //вытаскиваем значение атрибута валуе
        String textFromField = earnMoneyPage.getCodeField().getAttribute("value");
        //нажать кнопку и вытащить инфо из клипборда
        //разбиваем стринг по = и берет вторую часть
        var textFromClipBoard = earnMoneyPage.getTextFromClipBoard().split("=")[1];
        //сравниваем текст валуе и из клипборда
        Assert.assertEquals(textFromField,textFromClipBoard);

    }
    @Test
    public void searchNYK_sixWrapperFounded(){
       // var landingPage = logintoApp("useras","mailinator");
        var landingPage = new LandingPage(driver);
        //open landing page
        landingPage.open();
        Assert.assertTrue(landingPage.isLanded());


        //search element Thumbs NYC and go to search page
        var searchNYCPage = landingPage.openSearchNYCPage();
        Assert.assertEquals(searchNYCPage.getNYCTumbs(),6);

    }


}


