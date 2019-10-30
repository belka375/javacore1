package tests.shw13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLInputElement;
import pageObjects.CreateTripPage;
import pageObjects.LandingPage;
import tests.BaseTest;



public class CreateTripNYtest extends BaseTest {

    @Test

    public void openCreateTripPage() throws InterruptedException {

        var landingPage = new LandingPage(driver);
        landingPage.open();
        Thread.sleep(3000);
        landingPage.openCreateTripPage();

    }



}
