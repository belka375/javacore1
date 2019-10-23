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
import java.util.Random;


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
                .ignoring(Exception.class);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        driver.quit();
    }

    @Test
    public void deens_TryToSignUpUsingGoodCredentials_SignUpPassed() throws InterruptedException {
        Random randomSelector = new Random();
        var randomNumber = randomSelector.nextInt(10000);


        driver.get("https://deens-master.now.sh/");



        fluentWait.until(x->x.findElement(By.xpath("//*[@href='/register']")).isEnabled());
        driver.findElement(By.xpath("//*[@href='/register']")).click();



        Assert.assertEquals(driver.getCurrentUrl(), "https://deens-master.now.sh/register");


        fluentWait.until(x->driver.findElement(By.xpath("//*[@class='login-img-content']")).isEnabled());
        WebElement signUpMessage = driver.findElement(By.xpath("//*[@class='login-img-content']"));

        String text = signUpMessage.getText();
       Assert.assertEquals(text, "Plan your next trip with us!");

        WebElement userName = driver.findElement(By.xpath("//*[@id='username']"));
        userName.sendKeys("katrina" + randomNumber);

        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("817" +randomNumber+"@mailinator.com");

        WebElement passord = driver.findElement(By.xpath("//*[@id='password']"));
        passord.sendKeys("88888888");

        WebElement registerButton = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        registerButton.click();


        fluentWait.until(x->x.findElement(By.xpath("//*[@role='listbox']")).isEnabled());
        Assert.assertTrue(driver.findElements(By.xpath("//*[@role='listbox']")).size() != 0);
        Assert.assertEquals(driver.getCurrentUrl(), "https://deens-master.now.sh/");
    }
}