package hw14;

import DeensPages.MainPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import shw_Practice.BaseTests;

public class TestScrollPage extends BaseTests {
    @org.testng.annotations.Test
    public void scroll_checkCreateTripButton_popUpWindowAppeared() throws InterruptedException {
        MainPage mainPage=new MainPage(driver);
        mainPage.open();
        mainPage.scrollToButton();
        var popUp=driver.findElements(By.xpath("//*[@class='TripCreator__Option-eyiRVG dMLMqa']"));
        Assert.assertEquals(popUp.size(),3);
    }
}
