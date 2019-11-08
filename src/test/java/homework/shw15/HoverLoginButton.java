package homework.shw15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverLoginButton {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void deens_hoverOverLooginButton_buttonChangeColor(){
        driver.get("https://deens-master.now.sh/");

        Actions builder = new Actions(driver);
        WebElement loginButton = driver.findElement(By.xpath("//*[@href='/login']"));
        builder.moveToElement(loginButton).build().perform();

        var buttonColor = loginButton.getCssValue("background-color");
        Assert.assertEquals(buttonColor, "rgba(118, 196, 227, 1)");

    }
}
