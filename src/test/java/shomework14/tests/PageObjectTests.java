package shomework14.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import shomework14.pageObjects.DestinationPage;
import shomework14.pageObjects.LandingPage;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


public class PageObjectTests extends BaseTest {
    @Test
    public void clickOnCreateTripAndStartEarningButton() {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
        landingPage.openNewTrip();
        boolean newTrip = landingPage.getNewTripWindow().isDisplayed();
        Assert.assertTrue(newTrip);
    }

    @Test
    public void checkNumberOfTripsInNewYork() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
        DestinationPage destinationPage = landingPage.open("New York");
        var trips = destinationPage.getTrips();
        Assert.assertEquals(trips.size(), 6);
    }

    @Test
    public void getReferenceCode() throws InterruptedException, IOException, UnsupportedFlavorException {
        var landingPage = loginToApp("dinabestom", "#####___");
        Thread.sleep(3000);
        var earnMoney = landingPage.openEarnMoneyPage();
        var textFromField = earnMoney.getCodeField().getAttribute("value");
        var textFromClipboard = earnMoney.getTextFromClipboard().split("=")[1];
        Assert.assertEquals(textFromClipboard, textFromField);
    }


}
