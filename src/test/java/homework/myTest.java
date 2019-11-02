package homework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class myTest {
    private WebDriver driver;
    WebDriverWait wait;
    WebDriverWait longWait;
    Wait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        longWait = new WebDriverWait(driver, 200);

        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }
    @Test
    public void openUrl_TryToOpenDeens_GoogleOpened() {
        driver.get("https://deens-master.now.sh/");
        var title = driver.getTitle();
    }
    @Test
    public void TryToScrollDown(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://deens-master.now.sh/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        Object x = jse.executeScript("scroll(0,400)");

        WebElement createTripButton = driver.findElement(By.xpath("(//*[@class='commonStyles__PStrong-dyAKls fcjYkY'])[3]"));
        createTripButton.click();


    }

}
