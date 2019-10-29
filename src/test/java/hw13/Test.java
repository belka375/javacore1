package hw13;


import DeensPages.MainPage;
import org.testng.Assert;
import shw_Practice.BaseTests;

public class Test extends BaseTests {


    @org.testng.annotations.Test
    public void checkNumberOfTrips() throws InterruptedException {
        MainPage mainPage=new MainPage(driver);
        mainPage.open();
        SearchDestination searchDestination=mainPage.open("");
        var newYork=searchDestination.getNewYork();
        Thread.sleep(5000);
        Assert.assertEquals(newYork.size(),6);


    }


}
