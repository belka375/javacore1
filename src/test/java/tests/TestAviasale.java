package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjectModels.LandingPage;

public class TestAviasale extends BaseTest{



    @Test


    public void getPriceAviasale()  {
        LandingPage landingPage = new LandingPage(driver);
       landingPage.open();
        landingPage.fillFromToField("Moscow", "  Paris");
        landingPage.chooseDepartDate();
        landingPage.chooseReturnDate();
        landingPage.chooseNumberOfPassangers();
        landingPage.pressSearchForTicketsButtonAndBuy();
      var routeScheme = landingPage.showRouteScheme();
       Assert.assertTrue(routeScheme);


    }
}
