package hw9;
//***Test2 - fluent wait + xpath;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Testshw9_2 {
    private WebDriver driver;
    Wait <WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))



                .pollingEvery(Duration.ofMillis(80))
                .ignoring(NoSuchElementException.class);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_LoginYouAccount_UsingXpath_loginSuccessful() throws InterruptedException {
        driver.get("https://deens-master.now.sh/login");
        WebElement logAccount =  driver.findElement((By.xpath("//a[@href='/login']")));
        fluentWait.until(x -> logAccount.isEnabled());

        WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
        email.sendKeys("kgold94@myself.com");

        WebElement password = driver.findElement(By.xpath("//*[@id='email']//following::input[@id='password']"));
        password.sendKeys("freedom51");

        WebElement login = driver.findElement(By.xpath("//*[@id='email']//following::button[text()='Login']"));
        login.click();

        fluentWait.until(z -> z.findElement(By.xpath("//*[@src='/world.png']")).isDisplayed());
        WebElement pageImage = driver.findElement(By.xpath("//*[@src='/world.png']"));
        //Assert image of the world populated on a page
        Assert.assertTrue(pageImage.isDisplayed());
    }
}