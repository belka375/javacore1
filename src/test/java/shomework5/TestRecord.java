package shomework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRecord {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(7000);
        driver.quit();
    }
        @Test
    public void deens_testText(){
            driver.get("https://deens-master.now.sh/");
            WebElement element=driver.findElement(By.xpath("//h1[@class='Home__HomeTagLine-iRolTP bAczAY']"));
            String text=element.getText();
            Assert.assertEquals(text,"Customizable travels created by locals for free");
        }
}
