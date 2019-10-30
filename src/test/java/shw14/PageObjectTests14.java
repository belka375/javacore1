package shw14;
//*Write test, using Page Object Model
//*Site https://deens-master.now.sh/
//*1. зайти на титульную страницу
//*2. Scroll down and find button Create a trip and Start earning (Use JavaScript executor)

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageObjectTests14 {
    WebDriver driver;
    WebDriverWait wait;


        @BeforeMethod
        public void startUp() {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
        }

        @AfterMethod
        public void tearDown() throws InterruptedException {
          Thread.sleep(1000);
            driver.quit();
        }

    @Test(enabled=true)
    public void findButtonWithoutScroll()  {
        var landingPage = new LandingPage14(driver);
        landingPage.openPage();
        landingPage.getCreateTripButton().click();

        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Premium')]")).isDisplayed());
    }

    @Test
    public void findButtonWithScroll() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        var expectedUrl = "https://deens-master.now.sh/new/trip";
        var landingPage = new LandingPage14(driver);
        landingPage.openPage();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //wait.wait(2000);
        var createTripElement = landingPage.getCreateTripButton();
        createTripElement.click();
        var newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl, expectedUrl,"expected new page!"); ;

    }
}






