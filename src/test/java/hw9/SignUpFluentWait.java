package hw9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class SignUpFluentWait {
    private WebDriver driver;
    Wait<WebDriver> fluentWait;


    @BeforeMethod
    public void deensSignUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(100));
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void deens_tryToSignUp_signUpSuccessful() throws InterruptedException {
        driver.get("https://deens-master.now.sh/");
        fluentWait.until(x->driver.findElement(By.xpath("//*[@href='/register']")).isDisplayed());
        driver.findElement(By.xpath("//*[@href='/register']")).click();
        fluentWait.until(x->x.findElement(By.xpath("//*[@id='username']")).isEnabled());
        var userName=driver.findElement(By.xpath("//*[@id='username']"));
        var email=driver.findElement(By.xpath("//*[@id='email']"));
        var password=driver.findElement(By.xpath("//*[@id='password']"));
        var registerBtn=driver.findElement(By.xpath("//*[@class='ui large fluid button green-btn pl-btn']"));
        userName.sendKeys("akhhxc552");
        email.sendKeys("tell.joshuan@thtt.us");
        password.sendKeys("123456789");
        registerBtn.click();
        fluentWait.until(x->x.findElement(By.xpath("//*[@alt='user avatar']")).isEnabled());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@alt='user avatar']")).isEnabled());

    }
}
