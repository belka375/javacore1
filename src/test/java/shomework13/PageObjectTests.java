package shomework13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import shomework13.pageObjects.LandingPage;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;



public class PageObjectTests extends BaseTest {
    @Test
    public void getNewYorkTours() throws InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
        landingPage.openNewYorkPage();
        Thread.sleep(2000);
        int numberOfTrips = (driver.findElements(By.cssSelector(".ewiHv"))).size();
        Assert.assertEquals(numberOfTrips,6);
}
    @Test
    public void getReferralCode() throws InterruptedException, IOException, UnsupportedFlavorException {
        var landingPage = loginToApp("dinabestom", "#####___");
        Thread.sleep(3000);
        var earnMoney = landingPage.openEarnMoneyPage();
        var textFromField = earnMoney.getCodeField().getAttribute("value");
        var textFromClipboard = earnMoney.getTextFromClipboard().split("=")[1];
        Assert.assertEquals(textFromClipboard, textFromField);
    }



}
