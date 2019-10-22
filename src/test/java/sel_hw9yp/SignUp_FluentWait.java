package sel_hw9yp;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/* Создать тест: 2. fluent wait + xpath
автоматизировать на сайте https://deens-master.now.sh/
        workflow -> Sign up:
        а. открыть страницу регистрации,
        б. заполнить поля
        в. зарегистрироваться
        г. ассертать

The fluent wait is used to tell the web driver to wait for a condition,
as well as the frequency with which we want to check the condition before throwing an "ElementNotVisibleException" exception.
Frequency: Setting up a repeat cycle with the time frame to verify/check the condition at the regular interval of time
            Syntax:
     Wait wait = new FluentWait(WebDriver reference)
        .withTimeout(Duration.ofSeconds(SECONDS))
        .pollingEvery(Duration.ofSeconds(SECONDS))
        .ignoring(Exception.class);
        */

public class SignUp_FluentWait  {
    private WebDriver driver;
    Wait<WebDriver> fluentWait;

    @BeforeMethod
    public void StartUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

    }
    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void  deens_TryToRegisterUsingFluentWait_RegistrationAssert() throws InterruptedException {
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);

        // launch Chrome and open Register page
        driver.get("https://deens-master.now.sh/register");

        //Maximizes the browser window
        driver.manage().window().maximize();

        fluentWait.until(x -> x.findElement(By.xpath("//*[@id='username']")).isDisplayed());
        WebElement name = driver.findElement(By.xpath("//*[@id='username']"));
        name.sendKeys("randomNameHere123");

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("randomEmail123@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("1111111111134");

        WebElement registerButton = driver.findElement(By.xpath("//*[text()='Register']"));
        registerButton.click();

        fluentWait.until(driver->driver.findElement(By.xpath("//*[@class=' ls-is-cached lazyloaded'][1]")).isEnabled());
        WebElement avatar = driver.findElement(By.xpath("//*[@class=' ls-is-cached lazyloaded'][1]"));
        Assert.assertTrue(avatar.isDisplayed());
    }
}
