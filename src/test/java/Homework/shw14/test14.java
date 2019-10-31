package Homework.shw14;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;


public class test14 extends BaseTest {


    @Test
    public void checkTripCreatorOpens(JavascriptExecutor jse) {
        var landingPage = new LandingPage(driver);
        landingPage.open();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        WebElement createTripLink = driver.findElement(By.xpath("//*[text()='Create a Trip & Start Earning']"));
        createTripLink.click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Start from scratch with an empty trip']")).isDisplayed());
    }

}
