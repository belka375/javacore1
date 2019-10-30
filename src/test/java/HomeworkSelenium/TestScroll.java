package HomeworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScroll {
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor)driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
//        Thread.sleep(500);
        driver.quit();
    }

    @Test
    public void scroll_Click_CreateATrip () throws InterruptedException {

        driver.get("https://deens-master.now.sh");
        Thread.sleep(500);
        WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Create a Trip')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
//      js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); -> to scroll down the page
        element.click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://deens-master.now.sh/new/trip");
        System.out.println("Expected URL: https://deens-master.now.sh/new/trip\nActual: "+URL);

    }
}
