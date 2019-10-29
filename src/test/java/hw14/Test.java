package hw14;

import DeensPages.MainPage;
import shw_Practice.BaseTests;

public class Test extends BaseTests {
    @org.testng.annotations.Test
    public void checkCreateTripButton() throws InterruptedException {
        MainPage mainPage=new MainPage(driver);
        mainPage.open();

    }
}
