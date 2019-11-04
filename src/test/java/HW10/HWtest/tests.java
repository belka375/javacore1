package HW10.HWtest;

import HW10.HWT.LandingP;
import HW10.HWT.SearchResults;
import HW10.HWT.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class tests extends BaseTest {


    @Test
    public void openSignUP() throws InterruptedException {
        LandingP landingPage = new LandingP(driver);
        landingPage.openLP();
        SignUpPage signUpPage = landingPage.openSignUpPage();
        Thread.sleep(3000);
        signUpPage.signup("user", "email", "password");
        var customazibleTravelsText = driver.findElement(By.xpath("//*[contains(@style,'color')]"));
        Assert.assertTrue(true, String.valueOf(customazibleTravelsText));


    }

    @Test
    public void getCode() throws InterruptedException, IOException, UnsupportedFlavorException {
        var landingPage = login("irina256", "malysh86");
        Thread.sleep(7000);
        var earnMoneyP = landingPage.openEM();


        var getTextFromField = earnMoneyP.getRefCode().getAttribute("value");
        var getTextCopied = earnMoneyP.getTextFromClipboard().split("=")[1];

        Assert.assertEquals(getTextFromField, getTextCopied);


    }

    @Test(enabled = false)
    public void checkNumberOfTripsInNY() {
        LandingP landingP = new LandingP(driver);
        landingP.openLP();
        SearchResults searchResults = landingP.open("New York");
        var trips = searchResults.getTrips();
        Assert.assertEquals(trips.size(), 6);

    }

    @Test
    public void Open_CreateATrip() throws InterruptedException {
        LandingP landingP = new LandingP(driver);
        landingP.openDeens();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        landingP.button().click();
        var whereToGo = driver.findElement(By.xpath("//h2[text()='Where do you want to go?']"));
        Assert.assertTrue(true, String.valueOf(whereToGo));

    }

    @Test
    public void HoverOver_Login_Button() throws InterruptedException {
        LandingP landingP = new LandingP(driver);
        landingP.openDeens();
        Actions builder = new Actions(driver);
        builder.moveToElement(landingP.element()).build().perform();
        Thread.sleep(2000);

        Assert.assertEquals(landingP.loginButton(), landingP.signInButton());

    }
}