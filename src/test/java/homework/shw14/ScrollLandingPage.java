package homework.shw14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollLandingPage {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void deens_scrollLandingPageAndClickEarnMoneyButton() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");

        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Start Earning')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        element.click();

        WebElement closeButton = driver.findElement(By.xpath("//*[@class='Modal__CloseButton-bYwDUg kjmCaG']"));
        Assert.assertEquals(true,closeButton.isDisplayed());




    }
}
