package Homework.shw13;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class test13 extends BaseTest{


    @Test
    public void checkNYSearchResult() throws InterruptedException, IOException, UnsupportedFlavorException {
        var landingPage = new LandingPage(driver);
        landingPage.open();
        SearchPage searchPage = landingPage.open("New York");
        var trips = searchPage.getTrips();

        Assert.assertEquals(trips.size(), 6);

    }
}
