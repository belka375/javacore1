package tests.SHW14;//package tests.SHW14;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import tests.BaseTest;
import pageObjects.LandingPage;


public class ScrollTest extends BaseTest {


    @Test
    public void openDestinationPageScroll() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();

        driver.manage().window().maximize();

        js.executeScript("window.scrollBy(0,2000)");

        Thread.sleep(3000);


        var createButton = driver.findElement(By.xpath("//*[text() = 'Create a Trip & Start Earning']"));
        createButton.click();


    }

}