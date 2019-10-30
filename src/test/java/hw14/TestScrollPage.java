package hw14;

import DeensPages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import shw_Practice.BaseTests;

public class TestScrollPage extends BaseTests {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @org.testng.annotations.Test
    public void scroll_checkCreateTripButton_() throws InterruptedException {
        MainPage mainPage=new MainPage(driver);
        mainPage.open();
        var button = driver.findElement(By.xpath("//*[contains(text(),'Create a Trip & Start Earning')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
        button.click();
        var popUp=driver.findElements(By.xpath("//*[@class='TripCreator__Option-eyiRVG dMLMqa']"));
        Assert.assertEquals(popUp.size(),3);

    }
}
