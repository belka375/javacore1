package sel_hw9yp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* Создать тест: 1. implicit wait + cssSelectors
автоматизировать на сайте https://deens-master.now.sh/
        workflow -> Sign up:
        а. открыть страницу регистрации,
        б. заполнить поля
        в. зарегистрироваться
        г. ассертать

The implicit wait will tell the WebDriver to wait a certain amount of time before it throws a "No Such Element Exception.”
The default setting of implicit wait is zero.
Once you set the time, the web driver will wait for that particular amount of time before throwing an exception.
        Syntax: driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
In the below example we have declared an implicit wait with the time frame of 20 seconds.
It means that if the element is not located on the web page within that time frame, it will throw an exception.
        */

public class SignUp_ImplicitWait {
    private WebDriver driver;

    @BeforeMethod
    public void StartUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown () throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
   public void  deens_TryToRegisterUsingImplicitWait_RegistrationAssert() throws InterruptedException{

        driver.get("https://deens-master.now.sh/register");

        WebElement name = driver.findElement(By.cssSelector("#username"));
        name.sendKeys("Kt1234567");

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("kt1234567@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("T1234567@123456");

        WebElement registerButton = driver.findElement(By.cssSelector("button.green-btn.pl-btn"));
        registerButton.click();

        WebElement avatar = driver.findElement(By.cssSelector("[alt='user avatar']"));
        Assert.assertTrue(avatar.isDisplayed());

        }
}
