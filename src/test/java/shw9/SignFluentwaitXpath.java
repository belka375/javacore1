package shw9;

import org.openqa.selenium.By;
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
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SignFluentwaitXpath {

    private WebDriver driver;
    Wait<WebDriver> fluentWait;

    @BeforeMethod
    public void sratUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver 2");

        driver = new ChromeDriver();
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);


        driver.quit();
    }

    @Test
    public void deens_TryToSignUpUsingGoodCredentials_SignUpPassed() throws InterruptedException {


        driver.get("https://deens-master.now.sh/");

        fluentWait.until(x->x.findElement(By.xpath("//*[@href='/register']")).isEnabled());
        driver.findElement(By.xpath("//*[@href='/register']")).click();



        Assert.assertEquals(driver.getCurrentUrl(), "https://deens-master.now.sh/register");

        fluentWait.until(x->x.findElement(By.xpath("//*[@class='login-img-content']")));
        WebElement signUpMessage = driver.findElement(By.xpath("//*[@class='login-img-content']"));

        String text = signUpMessage.getText();
       Assert.assertEquals(text, "Plan your next trip with us!");

        fluentWait.until(x->x.findElement(By.xpath("//*[@id='username']")));


        WebElement userName = driver.findElement(By.xpath("//*[@id='username']"));
        userName.sendKeys("katarina89");

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("889@mailinator.com");

        WebElement passord = driver.findElement(By.xpath("//*[@id='password']"));
        passord.sendKeys("88888888");

        WebElement registerButton = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        registerButton.click();


        fluentWait.until(x->x.findElement(By.cssSelector(".ls-is-cached")));
        Assert.assertTrue(driver.findElements(By.cssSelector(".ls-is-cached")).size() != 0);
        Assert.assertEquals(driver.getCurrentUrl(), "https://deens-master.now.sh/register");
    }
}